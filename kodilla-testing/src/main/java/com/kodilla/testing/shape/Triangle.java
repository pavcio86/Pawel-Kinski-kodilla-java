package com.kodilla.testing.shape;

class Triangle implements Shape {

    private String shapeName = "triangle";
    private int field = 30;

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public int getField() {
        return field;
    }
}
