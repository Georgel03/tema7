package org.fasttrackit.tema7;

public class Bottle {

    private double totalCapacity;

    private double availableLiquid;

    private boolean open;


    Bottle(double totalCapacity, double availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean hasMaxAvailLiq() {
        if (this.totalCapacity == this.availableLiquid) {
            return true;
        }
        else {
            return false;
        }
    }

    public double getAvailableLiquid() {
        return this.availableLiquid;
    }

    public double getEmptySpace() {
        return this.totalCapacity - this.availableLiquid;
    }

    public void openBottle() {

        if (this.open == true) {
            System.out.println("The bootle is already opened!");
        }
        else {
            this.open = true;
            System.out.println("Bottle has been opened");
        }
    }

    public void closeBottle() {
        if (this.open == false) {
            System.out.println("The bootle is already closed!");
        }
        else {
            this.open = false;
            System.out.println("Bottle has been closed");
        }
    }

    public void drinkAmount(double amount) {
        if (this.open == false) {
            System.out.println("You cannot drink from a closed bottle!");
            return;
        }
        else {
            if (amount <= this.availableLiquid) {
                this.availableLiquid -= amount;
                System.out.println("We drinked and we still have " + this.availableLiquid + " liters left");
            } else {
                System.out.println("It s not sufficient quantity!");
            }
        }
    }
}
