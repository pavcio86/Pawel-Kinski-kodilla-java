package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf_0_BooksInHands() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user0 = new LibraryUser("Zeron", "Zeromix", "00000000");
        List<Book> listOfBooks = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(listOfBooks);

        //when
        List<Book> user0RentedBooks = bookLibrary.listBooksInHandsOf(user0);

        //then
        assertEquals(0, user0RentedBooks.size());
    }

    @Test
    void listBooksInHandsOf_1_BookInHands() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Uno", "Theone", "11111111");
        Book book1 = new Book("Big Egg", "Donald Duck", 1996);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfBooks);

        // When
        List<Book> user1RentedBooks = bookLibrary.listBooksInHandsOf(user1);


        // Then
        assertEquals(1, user1RentedBooks.size());

    }

    @Test
    void listBooksInHandsOf_5_BooksInHands() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user5 = new LibraryUser("Fivon", "Hifive", "55555555");
        List<Book> listOfBooks = new ArrayList<>();
        Book book1 = new Book("The big egg", "Donald Duck", 1996);
        Book book2 = new Book("Egg next generation", "Donald Duck", 1997);
        Book book3 = new Book("Brawl in hatchery", "Donald Duck", 1998);
        Book book4 = new Book("Big egg boiled rough", "Donald Duck", 1999);
        Book book5 = new Book("Chicken origin", "Donald Duck", 2000);
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        when(libraryDatabaseMock.listBooksInHandsOf(user5)).thenReturn(listOfBooks);

        // When
        List<Book> user5RentedBooks = bookLibrary.listBooksInHandsOf(user5);


        // Then
        assertEquals(5, user5RentedBooks.size());

    }
}