package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.*;
import java.lang.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create emptyNumberList and use oddTerminator on it, " +
            "then oddTerminator should not find any number to exterminate "
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator oddTerminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyNumberList = new ArrayList<Integer>();
        ArrayList<Integer> naturalNumberList = new ArrayList<Integer>();
        naturalNumberList.add(12);
        naturalNumberList.add(13);
        naturalNumberList.add(14);
        naturalNumberList.add(15);
        naturalNumberList.add(16);
        naturalNumberList.add(17);

        naturalNumberList.removeAll(naturalNumberList);

        ArrayList<Integer>  expectedResult = naturalNumberList;
        System.out.println("Testing " + expectedResult);

        //When
        List<Integer> result = oddTerminator.exterminate(emptyNumberList);
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("when create naturalNumberList with a few numbers and use oddTerminator on it, " +
            "then oddTerminator should exterminate odd numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator oddTerminator = new OddNumbersExterminator();
        ArrayList<Integer> naturalNumberList = new ArrayList<Integer>();
        naturalNumberList.add(12);
        naturalNumberList.add(13);
        naturalNumberList.add(14);
        naturalNumberList.add(15);
        naturalNumberList.add(16);
        naturalNumberList.add(17);

        for (int i=0; i<naturalNumberList.size(); i++) {
            if (naturalNumberList.get(i) % 2 == 1){
                naturalNumberList.remove(i);
            }
        }

            ArrayList<Integer> expectedResult = naturalNumberList;

            //When
            List<Integer> result = oddTerminator.exterminate(naturalNumberList);
            System.out.println("Testing " + result);

            //Then
            Assertions.assertEquals(expectedResult, result);
        }
    }

