package com.kodilla.exception.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExceptionHandling {

    public String probablyIWillThrowException(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(x,y);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("date of process finishing : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
        return "Done";
    }
}