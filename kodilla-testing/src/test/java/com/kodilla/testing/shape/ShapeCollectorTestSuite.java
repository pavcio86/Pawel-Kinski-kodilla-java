package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Test for adding figures")
    class Adding{
        @Test
        void testAddFigure() {

            //Given
            ShapeCollector shapeColl = new ShapeCollector();
            Circle circle = new Circle();

            //When
            shapeColl.addFigure(circle);

            //Then
            Assertions.assertEquals(circle,shapeColl.getFigure(0));
        }
    }

    @Nested
    @DisplayName("Test for removing figures")
    class Removing{
        @Test
        void testRemoveFigure() {

            //Given
            ShapeCollector shapeColl = new ShapeCollector();
            Circle circle = new Circle();
            shapeColl.addFigure(circle);

            //When
            shapeColl.removeFigure(circle);

            //Thenn
            Assertions.assertEquals(null,shapeColl.getFigure(0));
        }
    }

    @Nested
    @DisplayName("Test for getting figures")
    class Getting{

        @Test
        void testGetFigure() {

            //Given
            ShapeCollector shapeColl = new ShapeCollector();
            Circle circle = new Circle ();
            shapeColl.addFigure(circle);

            //When
            Shape retrievedShape;
            retrievedShape = shapeColl.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Test for showing figures")
    class Showing{
        @Test
        void testShowFigure() {

            //Given
            ShapeCollector shapeColl = new ShapeCollector();
            Circle circle = new Circle ();
            shapeColl.addFigure(circle);
            String showCircle = circle.getShapeName() +" "+ circle.getField();

            //When
            shapeColl.showFigures();
            Shape gettedShape = shapeColl.getFigure(0);
            String showFigure = gettedShape.getShapeName() +" "+gettedShape.getField();

            //Then
            Assertions.assertEquals(showCircle,showFigure);
        }
    }
}