package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;



class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> evenNumbersList = new ArrayList<>();

        for(int number : numbers) {
            if(number % 2 == 0) {
                evenNumbersList.add(number);
            }
        }
        return evenNumbersList;
    }
}

class Application {


    public static void main (String[] args){

        OddNumbersExterminator oddTerminator = new OddNumbersExterminator();

        ArrayList<Integer> naturalNumberList = new ArrayList<Integer>();
        naturalNumberList.add(12);
        naturalNumberList.add(13);
        naturalNumberList.add(14);
        naturalNumberList.add(15);
        naturalNumberList.add(16);
        naturalNumberList.add(17);
    }
}






