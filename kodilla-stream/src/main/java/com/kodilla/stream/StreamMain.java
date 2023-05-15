package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Mad Man",(text) -> text.toUpperCase());
        poemBeautifier.beautify(" DEFGFED ", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Lower Dangers", (text) -> text.replaceFirst("L","P").replace("D","P"));
        poemBeautifier.beautify(" I love stars so much ", (text) -> text.replace(' ','*'));
        poemBeautifier.beautify("      Simple Text  ", (text) -> text.trim());
    }
}