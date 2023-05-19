package com.kodilla.stream.array;


import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(n -> 1 * numbers[n])
                .forEach(System.out::println);

        double  average = IntStream.range(0, numbers.length)
                .map(n -> 1 * numbers[n])
                .average()
                .getAsDouble();

        return average;
    }
}
