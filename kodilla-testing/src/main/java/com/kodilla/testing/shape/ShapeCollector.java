package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList <Shape> figuresList = new ArrayList<>();

    public void addFigure(Shape shape){

        figuresList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figuresList.contains(shape)) {
            figuresList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure (int figureNumber ){
        if (figureNumber >= 0 && figureNumber < figuresList.size()) {
            return figuresList.get(figureNumber);
        }
        return null;
    }

    public void showFigures (){
        for (Shape name: figuresList) {
            System.out.println("Shape name is : " + name.getShapeName() +","+ " with field equals : "+name.getField()+"cm2" + ", ");
        }
    }
}

