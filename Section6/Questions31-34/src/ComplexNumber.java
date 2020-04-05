package com.example.challenge;

/* Question 34 */

public class ComplexNumber {
    private double real;
    private double imaginary;

    public double substract(double real, double imaginary) {
        return (real - imaginary);
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }

    public double add(ComplexNumber complexNumber) {
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }

    public double add(double real, double imaginary) {
        return (real + imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
