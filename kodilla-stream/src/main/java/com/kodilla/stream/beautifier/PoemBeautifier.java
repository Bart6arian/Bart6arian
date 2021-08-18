package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String toDecor, PoemDecorator poemDecorator) {
        String changer = poemDecorator.decorate(toDecor);
        System.out.println("Text before change: " + toDecor +'\n' +"Changed text: "+changer);;
    }
}
