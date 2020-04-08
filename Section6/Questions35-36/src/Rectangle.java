package com.example.challenge;

/*Question 36 */

public class Rectangle {
    private double width;
    private double length;

    public double getArea() {
        return(width * length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width, double length) {
        if(width < 0) {
            this.width = 0;
        }else {
            this.width = width;
        }
        if(length < 0) {
            this.length = 0;
        }else {
            this.length = length;
        }
    }
}
