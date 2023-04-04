package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;



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

    @DisplayName("when list created " +
                 "then method checks is the list is empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        List <Integer> numbers = new ArrayList<>();

        //When
        boolean result = numbers.isEmpty();

        //Then
        Assertions.assertTrue(result);

    }

    @DisplayName("when list created " +
                 "then method checks is the list is fill"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        List <Integer> numbers = new ArrayList<>();


        //When
        boolean result = numbers.isEmpty();

        //Then
        Assertions.assertFalse(!result);

    }
}

