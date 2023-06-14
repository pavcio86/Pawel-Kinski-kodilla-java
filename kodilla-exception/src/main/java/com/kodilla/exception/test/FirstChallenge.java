package com.kodilla.exception.test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(" warning!!!   divider cannot equals " + e.getMessage() + " , enter right divider");
        }finally {
            System.out.println("time of process finishing :  " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        }
    }
}