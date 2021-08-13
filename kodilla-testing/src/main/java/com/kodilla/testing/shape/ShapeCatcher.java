package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCatcher {
    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String allFigures = "";

        for(Shape figures : shapes) {
            if(allFigures.length() >= 1) {
                allFigures += ", " + figures.getShapeName();
            } else {
                allFigures += figures.getShapeName();
            }
        }
        return allFigures;
    }
}
