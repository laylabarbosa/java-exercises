/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1_200539617;

/**
 *
 * @author layladesouzabarbosa
 */

import java.util.*;
import java.util.Scanner;

public class Tasks1n2 {

  
    public static void Task1(){
       
        Scanner input=new Scanner(System.in);
        System.out.println("Choose a number? ");
        int num1= input.nextInt();
        
        System.out.println("Now, choose a second number? ");
        int num2= input.nextInt();
        
        System.out.println("Lastly, choose an arithmetic operator? ");
        char operator= input.next().charAt(0);

        if (operator == '/'){
            int results= num1 / num2;
            System.out.println("You chose division. This is your equation: ");
            System.out.print(num1);System.out.print(operator);System.out.print(num2);
            System.out.print(" equals to: ");
            System.out.println(results);
        }
        
        else if (operator == '*'){
            int result= num1 * num2;
            System.out.println("You chose multiplication. This is your equation: ");
            System.out.print(num1);System.out.print(operator);System.out.print(num2);
            System.out.print(" equals to: ");
            System.out.println(result);
        }    
        else if (operator == '%'){
            int result= num1 % num2;
            System.out.println("You chose modulus. This is your equation: ");
            System.out.print(num1);System.out.print(operator);System.out.print(num2);
            System.out.print(" equals to: ");
            System.out.println(result);
        }
        
        else if (operator == '+'){
            int result= num1 + num2;
            System.out.println("You chose addition. This is your equation: ");
            System.out.print(num1);System.out.print(operator);System.out.print(num2);
            System.out.print(" equals to: ");
            System.out.println(result);
        }
        
        else if (operator == '-'){
            int result= num1 - num2;
            System.out.println("You chose subtraction. This is your equation: ");
            System.out.print(num1);System.out.print(operator);System.out.print(num2);
            System.out.print(" equals to: ");
            System.out.println(result);
        }
        else if (operator == '^'){
            int result= 1;
            for (int i=1; i<=num2; i++){
                result = result*num1;
            }
            System.out.println("You chose exponential. This is your equation: ");
            System.out.print(num1);System.out.print(operator);System.out.print(num2);
            System.out.print(" equals to: ");
            System.out.print(result);
        }
        else{
            System.out.print(" Sorry, I can not understand you ");
        }
    }
        public static void Task2(){
       
        Scanner input=new Scanner(System.in);
        System.out.println("Choose a number? ");
        int num1= input.nextInt();
        
        System.out.println("Now, choose a second number? ");
        int num2= input.nextInt();
        
        System.out.println("Lastly, choose an arithmetic operator? ");
        char operator= input.next().charAt(0);

        switch (operator) {
            case '/':
                int results= num1 / num2;
                System.out.println("You chose division. This is your equation: ");
                System.out.print(num1);System.out.print(operator);System.out.print(num2);
                System.out.print(" equals to: ");
                System.out.println(results);
                break;
            case '*':
                {
                    int result= num1 * num2;
                    System.out.println("You chose multiplication. This is your equation: ");
                    System.out.print(num1);System.out.print(operator);System.out.print(num2);
                    System.out.print(" equals to: ");
                    System.out.println(result);
                    break;
                }
            case '%':
                {
                    int result= num1 % num2;
                    System.out.println("You chose modulus. This is your equation: ");
                    System.out.print(num1);System.out.print(operator);System.out.print(num2);
                    System.out.print(" equals to: ");
                    System.out.println(result);
                    break;
                }
            case '+':
                {
                    int result= num1 + num2;
                    System.out.println("You chose addition. This is your equation: ");
                    System.out.print(num1);System.out.print(operator);System.out.print(num2);
                    System.out.print(" equals to: ");
                    System.out.println(result);
                    break;
                }
            case '-':
                {
                    int result= num1 - num2;
                    System.out.println("You chose subtraction. This is your equation: ");
                    System.out.print(num1);System.out.print(operator);System.out.print(num2);
                    System.out.print(" equals to: ");
                    System.out.println(result);
                    break;
                }
            case '^':
                {
                    int result= num1 ^= num2;
                    System.out.println("You chose exponential. This is your equation: ");
                    System.out.print(num1);System.out.print(operator);System.out.print(num2);
                    System.out.print(" equals to: ");
                    System.out.println(result);
                    break;
                }
            default:
                System.out.print(" Sorry, I can not understand you ");
                break;
        }
    }
   
    public static void main(String[] args) {
        Tasks1n2.Task1();
        Tasks1n2.Task2();
    }
}
