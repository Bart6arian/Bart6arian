package com.kodilla.testing.shape;

public class Circle implements Shape{
    private int r;
    private String shapeName;

    public Circle(int r, String shapeName) {
        this.r = r;
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return ((r*r) *3.14);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (r != circle.r) return false;
        return getShapeName() != null ? getShapeName().equals(circle.getShapeName()) : circle.getShapeName() == null;
    }

    @Override
    public int hashCode() {
        int result = r;
        result = 31 * result + (getShapeName() != null ? getShapeName().hashCode() : 0);
        return result;
    }
}
