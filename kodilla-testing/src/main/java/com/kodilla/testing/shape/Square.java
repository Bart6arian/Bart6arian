package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private int a;

    public Square(String shapeName, int a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (a*a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (a != square.a) return false;
        return getShapeName() != null ? getShapeName().equals(square.getShapeName()) : square.getShapeName() == null;
    }

    @Override
    public int hashCode() {
        int result = getShapeName() != null ? getShapeName().hashCode() : 0;
        result = 31 * result + a;
        return result;
    }
}
