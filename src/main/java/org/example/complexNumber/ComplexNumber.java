package org.example.complexNumber;

public class ComplexNumber {
    // write code here
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber anothercomplexNumber) {
        add(anothercomplexNumber.real, anothercomplexNumber.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber anothercomplexNumber) {
        subtract(anothercomplexNumber.real, anothercomplexNumber.imaginary);
    }
}
