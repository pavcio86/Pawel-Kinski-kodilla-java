package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(PoemDecorator poemDecorator){
        String result = poemDecorator.decorate();
        System.out.println(result);
    }
}
