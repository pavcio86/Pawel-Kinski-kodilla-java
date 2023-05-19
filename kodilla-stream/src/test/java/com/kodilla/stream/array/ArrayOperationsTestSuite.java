package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] numbersArray = {1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,21,1,};

        //When
        double result = ArrayOperations.getAverage(numbersArray);

        //Then
        Assertions.assertEquals(2.05, result);

    }
}
