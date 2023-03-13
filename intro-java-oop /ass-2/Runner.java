/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Assignment2_200539617;

/**
 *
 * @author layladesouzabarbosa
 */
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        //asking the user bank and branch location
        System.out.println("Type your bank name");
            String bankName = input.nextLine();
        System.out.println("Type your branch location");
            String branchLocation = input.nextLine();
       
        Bank bank= new Bank(bankName, branchLocation);

        //Outputing a custom welcome message'
        System.out.println("***************************************************************************");
        System.out.println( "Welcome to " + bank.getBranchLocation() + " branch of " + bank.getBankName());

        
        while(true){
        System.out.println("Choose from the following options:");
        System.out.println("Add Account");
        System.out.println("View Accounts");
        System.out.println("Account Details");
        System.out.println("Modify Account");
        System.out.println("Delete Account");
        System.out.println("Summary");
        System.out.println("Help ");
        System.out.println("Exit ");
            String command = input.nextLine();
            //giving the user an exit from the menu
            if (command.toLowerCase().contentEquals("exit")) return;
            bank.parseCommand(command);

        }
    }

}
