package org.example.carpetCalculation;

public class Carpet {
    // write code here
    private double cost;

    public Carpet(double cost) {
         setCost(cost);
    }

     public void setCost(double cost) {
         this.cost = cost > 0 ? cost : 0;
     }

    public double getCost() {
        return cost;
    }
}
