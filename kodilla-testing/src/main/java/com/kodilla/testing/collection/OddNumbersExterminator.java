package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;



class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int number : numbers) {
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}

class Application {


    public static void main (String[] args){

        OddNumbersExterminator oddTerminator = new OddNumbersExterminator();

        ArrayList<Integer> emptyNumberList = new ArrayList<Integer>();

        ArrayList<Integer> naturalNumberList = new ArrayList<Integer>();
        naturalNumberList.add(12);
        naturalNumberList.add(13);
        naturalNumberList.add(14);
        naturalNumberList.add(15);
        naturalNumberList.add(16);
        naturalNumberList.add(17);
    }
}






