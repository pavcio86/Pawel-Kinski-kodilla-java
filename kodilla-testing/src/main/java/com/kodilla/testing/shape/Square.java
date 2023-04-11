package com.kodilla.testing.shape;

class Square implements Shape {

    private String shapeName = "square";
    private int field = 20;

    @Override
    public String toString() {
        return "Square{" +
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
