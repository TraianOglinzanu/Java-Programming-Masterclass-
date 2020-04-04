package com.example.challenge;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.hypot(x, y);
    }

    public double distance(int x, int y) {
        return Math.hypot(this.x-x, this.y-y);
    }

    public double distance(Point point) {
        return Math.hypot(this.x-point.x, this.y-point.y);
    }
}
