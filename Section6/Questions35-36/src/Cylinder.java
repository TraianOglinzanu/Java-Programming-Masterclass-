package com.example.challenge;

/* Question 35 */

public class Cylinder extends Circle {
    private double height;

    public double getVolume() {
        return (height * getArea());
    }

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }
}
