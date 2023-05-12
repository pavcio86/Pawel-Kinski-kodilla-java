package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String madMan = "Mad Man";
        PoemDecorator big = madMan::toUpperCase;
        poemBeautifier.beautify(big);
        PoemDecorator sad = () -> madMan.replaceFirst("M","S");
        poemBeautifier.beautify(sad);
        PoemDecorator max = () -> madMan.replace('n','x');
        poemBeautifier.beautify(max);
        PoemDecorator mama = () -> madMan.substring(0,2) + madMan.substring(4,6);
        poemBeautifier.beautify(mama);
        PoemDecorator small = madMan::toLowerCase;
        poemBeautifier.beautify(small);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}