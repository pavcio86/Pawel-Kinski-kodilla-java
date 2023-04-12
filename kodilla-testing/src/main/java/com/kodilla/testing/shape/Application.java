package com.kodilla.testing.shape;

public class Application {
    public static void main(String args[]){
        ShapeCollector shapeColl = new ShapeCollector();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        shapeColl.addFigure(circle);
        shapeColl.addFigure(triangle);
        shapeColl.addFigure(square);

        shapeColl.showFigures();
        System.out.println();
        System.out.println(shapeColl.getFigure(1));
        System.out.println(shapeColl.getFigure(0));
        System.out.println();
        shapeColl.removeFigure(triangle);
        shapeColl.showFigures();

    }
}
