package com.mycompany.miniexercise2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author layladesouzabarbosa
 */

public class Vehicle {
    //declaring variables with unique data types and acceessibility levels
    private String color;
    public int numberOfDoors;
    protected boolean gasPowered;
    
    //defaullt constructor
    public Vehicle() {
    }
    
    //4 constructors
    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }
    
    public Vehicle(String color) {
        this.color = color;
    }
    
    public Vehicle(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }
    
    public Vehicle(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    //setters and getters

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }
    
    //overrding toString() method to proper message 
    @Override
    public String toString(){
        return "This vehicle is " + this.getColor() + ", it has " + this.getNumberOfDoors() +
                    " doors. It is gas powered " + this.isGasPowered();
    }
    
    //method to determine if the vehicle fills the requirements to be eco friendly
    public String isEcoFriendly(){
        if (this.getNumberOfDoors() <=  2 && this.isGasPowered() == false){
            return "This vehicle is eco friendly";
        }
        else{
            return "This vehicle is not eco friendly";    
        }
    }
    // public static void main(String[] args) {
    //     Vehicle car1=new Vehicle("red", 2, false);
    //     System.out.println(car1);
    //     System.out.println(car1.isEcoFriendly());
    // }
}
