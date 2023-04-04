package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }


        Calculator simplecalculator = new Calculator();

        int addResult = simplecalculator.add(6,4);
        int substractResult = simplecalculator.substract(6,4);

        if(addResult == 10){
            System.out.println("addition test :   OK");
        }else{
            System.out.println("addition test : FAILED!");
        }

        if(substractResult == 2){
            System.out.println("substraction test :   OK");
        }else{
            System.out.println("substraction test : FAILED!");
        }

    }
}
