package org.example.carpetCalculation;

public class Floor {
        // write code here
    private double width;
    private double length;

    public Floor(double width, double length) {
         setWidth(width);
         setLength(length);
    }

     public double getWidth() {
         return width;
     }

     public double getLength() {
         return length;
     }

     public void setWidth(double width) {
         this.width = width > 0 ? width : 0;
     }

     public void setLength(double length) {
         this.length = length > 0 ? length : 0;
     }

    public double getArea() {
        return width*length;
    }
}

