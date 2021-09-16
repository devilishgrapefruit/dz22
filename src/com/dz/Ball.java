package com.dz;

public class Ball {
    private String color;
    private int size;
    private String kind;

    public Ball(String color, int size, String kind) {
        this.color = color;
        this.size = size;
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + getColor() + '\'' +
                ", size=" + getSize() +
                ", kind='" + getKind() + '\'' +
                '}';
    }

}
