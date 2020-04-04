package com.example.challenge;

public class WallArea {
    private double width;
    private double height;

    public  WallArea(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public WallArea() {
        this(0,0);
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
