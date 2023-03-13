/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1_200539617;

/**
 *
 * @author layladesouzabarbosa
 */
import java.util.*;
import java.util.Scanner;
public class Tasks5_8 {
    public static void Task7(int arry[]){
        int arr7[]= arry;
        for(int j=0; j<arr7.length; j++){
            System.out.println("this is your object  " + j);
            System.out.println(j);
        }
    
    }
    public static void Task6(int arry[]){
        Scanner input=new Scanner(System.in);
        int arr6[] = arry;
        for(int j=0; j<arr6.length; j++){
            System.out.println("Insert object number " + j);
            int addvalue = input.nextInt();
            arr6[j]=addvalue;
        }
       Tasks5_8.Task7(arr6);
        
    }
    public static void Task5(){
       
        Scanner input=new Scanner(System.in);
        System.out.println("How many elements would you like to create?");
        int elements= input.nextInt();
        
        int arr5[]=new int[elements];
        Tasks5_8.Task6(arr5);
        
    }
        
   
  
    public static void main(String[] args) {
        Tasks5_8.Task5();
    }
}
