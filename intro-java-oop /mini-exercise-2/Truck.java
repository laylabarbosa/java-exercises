/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniexercise2;

/**
 *
 * @author layladesouzabarbosa
 */
public class Truck extends Vehicle{
    //declaring additional variables
    public int numberOfSeats;
    protected double trunkSpace;
    
    //default constructor 
    public Truck() {
    }
    
    //constructors that mirror Vehicle class
    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }

    public Truck(String color) {
        super(color);
    }

    public Truck(boolean gasPowered) {
        super(gasPowered);
    }

    public Truck(int numberOfDoors) {
        super(numberOfDoors);
    }
    
    //additional consructors
    public Truck(String color, int numberOfSeats, boolean gasPowered, int numberOfDoors) {
        super(color, numberOfDoors, gasPowered);
        this.numberOfSeats = numberOfSeats;
    }

    public Truck(double trunkSpace, String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    public Truck(int numberOfSeats, double trunkSpace, String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
        this.numberOfSeats = numberOfSeats;
        this.trunkSpace = trunkSpace;
    }
    
    //setters and getters
    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }
    
    public void setTrunkSpace(double trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getTrunkSpace() {
        return trunkSpace;
    }

    //overrding toString() method to proper message
    @Override
    public String toString() {
        return "This truck is " + this.getColor() + ", it has " + this.getNumberOfDoors() + " doors, " +
                this.getNumberOfSeats() + " seats, and a trunk space of " + this.getTrunkSpace() + 
                        " cubic feet. It is gas powered " + this.isGasPowered();
    }
    
    //
    @Override 
    public String isEcoFriendly(){
        if (this.getNumberOfDoors() <=  2 && this.getNumberOfSeats() <= 2 && this.isGasPowered() == false){
            return "This truck is eco friendly";
        }
        else{
            return "This truck is not eco friendly";    
        }
    }
    // public static void main(String[] args) {
    //     Truck trc1=new Truck(2, 35.6, "red", 2, false);
    //     System.out.println(trc1);
    //     System.out.println(trc1.isEcoFriendly());
    // }
}
