/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniexercise1;

/**
 *
 * @author layladesouzabarbosa
 */

import java.util.*;
import java.util.Scanner;
public class MiniExercise1 {
    private float value;
    private int number;
    
    public MiniExercise1() {
    }
    public MiniExercise1(float value) {
        this.value=value;
    }
    public MiniExercise1(int number) {
        this.number=number;
    }
    public void setValue(float value){
            this.value=value;
    }
    public void setNumber(int number){
            this.number=number;
    }
    
    public float getValue(){
        return value;
    }
    public int getNumber(){
        return number;
    }
    public static void Task1(){
        Scanner input=new Scanner(System.in);
        System.out.println("How many elements would you like to create? ");
        int elements= input.nextInt();

        MiniExercise1[] objarr= new MiniExercise1[elements];

        for (int i=0; i<elements; i++){
            
            System.out.println("Insert object number " + i);
            float addvalue = input.nextFloat();
            MiniExercise1 obj1= new MiniExercise1();
            obj1.setValue(addvalue);
            objarr[i]=obj1;            
        }
        
        for (int i=0; i<elements;i++){
            
            int count= (int)objarr[i].getValue();
            
            if (count== 1 || count== 0){
                var result= (0!= count);
                System.out.println("this is your value " + objarr[i].getValue() + " converted to boolean = " + result);
            }
            if (count <= 127 && count > -128){ 
                byte result = (byte)count;
                System.out.println("this is your value " + objarr[i].getValue() + " converted to byte = " + result);
            } 
            
            if (count <= 321767 && count > -32768){ 
                short result;
                result = (short)count;
                System.out.println("this is your value " + objarr[i].getValue() + " converted to short = " + result);
            } 
            if (i<elements){
                int result= (int)objarr[i].getValue();
                System.out.println("this is your value " + objarr[i].getValue() + " converted to integer = " + result);
            }
        }
   }
    public static void getSummary(int ncorrectanswer, int nquestions){
            System.out.println("You answered " + ncorrectanswer + " out of " + nquestions + " questions correctly.");
            System.out.println("That is the percentage of " + Math.round(ncorrectanswer * 100 / nquestions) + "%");
    }
    public static void Task2(){
      MiniExercise1[][] objarr2= new MiniExercise1[10][10];
            for (int i=0; i<=9; i++){ 
                for (int j=0; j<=9; j++){
                    MiniExercise1 obj1= new MiniExercise1();
                    int value = (i+1) * (j+1);
                    obj1.setNumber(value);
                    objarr2[i][j]= obj1;   
//                    System.out.print( objarr2[i][j].getNumber() + "\s");
                }
//                System.out.println("\n-----------------------------------");
            }
        int correctanswer =0;
        Scanner input=new Scanner(System.in);
        System.out.println("How many questions would you like to answer? ");
        int questions= input.nextInt();
        
        for(int i=1; i<=questions; i++){
            
            Random randomNumbers = new Random();
            int num1= randomNumbers.nextInt(9-0) + 1;
            int num2= randomNumbers.nextInt(9-0) + 1;
            System.out.println("Wat is " + num1 + "x" + num2 + "?");
            int answer= input.nextInt();
            if (answer == objarr2[num1-1][num2-1].getNumber()){
                System.out.println("Congratulations, you are right!");
                correctanswer = correctanswer + 1;
            }
            else{
                System.out.println("Sorry, you are wrong! Correct answer is " + objarr2[num1-1][num2-1].getNumber());
            }
           
            
                
        }
        
         MiniExercise1.getSummary(correctanswer, questions);
    }
       
    
    public static void main(String[] args) {
//        MiniExercise1.Task1();
        MiniExercise1.Task2();
        
    }
}
    
    
    

