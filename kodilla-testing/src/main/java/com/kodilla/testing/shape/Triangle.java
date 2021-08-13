package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int a;
    private int h;
    private String shapeName;

    public Triangle(int a, String shapeName, int h) {
        this.a = a;
        this.shapeName = shapeName;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (a*h)/(2*h);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        if (h != triangle.h) return false;
        return getShapeName() != null ? getShapeName().equals(triangle.getShapeName()) : triangle.getShapeName() == null;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + h;
        result = 31 * result + (getShapeName() != null ? getShapeName().hashCode() : 0);
        return result;
    }
}
