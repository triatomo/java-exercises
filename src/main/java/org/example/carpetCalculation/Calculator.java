package org.example.carpetCalculation;

public class Calculator {
    // write code here
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

     public Floor getFloor() {
         return floor;
     }

     public Carpet getCarpet() {
         return carpet;
     }

     public void setFloor(Floor floor) {
         this.floor = floor;
     }

     public void setCarpet(Carpet carpet) {
         this.carpet = carpet;
     }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
