/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Assignment2_200539617;

/**
 *
 * @author layladesouzabarbosa
 */

public class Account{

    // instancing variables
    private String name;
    private String accountNumber;
    private double balance;
    
        //constructors
        public Account(String name, String accountnumber, double balance) throws Exception {
        setName(name);    
        setAccountNumber(accountnumber);
        setBalance(balance); 
        }
        public Account (){
        }

        //getters 
        public double getBalance(){
            return balance;
        }
    
        public String getAccountNumber(){
            return accountNumber;
        }
    
        public String getName(){
            return name;
        }

        //all setters take advantage of private helper methods to implement limitations to object properties. Moreover all of them throw custom exceptions 
        public void setBalance(double newBalance) throws Exception{
            if (checkBalance(newBalance)) this.balance=newBalance;
            else throw new Exception("I am sorry, you can only have a positive balance value.");

        }
        
        public void setAccountNumber(String newAccountNumber) throws Exception{
            if (checkAccountNumber(newAccountNumber)) this.accountNumber=newAccountNumber;
            else throw new Exception("I am sorry, accounts can only have alphanumerical characters.");
        }

        public void setName(String newName) throws Exception{
            if (checkName(newName)) this.name= newName;
            else throw new Exception("I am sorry, names can only have alphabetical characters, spaces and hyphens");
        }

        public String toString(){
            return "Account number is : " + this.getAccountNumber() + ", name of the account holder is: " + this.getName() + 
                ", account balance is: " + this.getBalance() + " canadian dollars.";
        }

        //private methods to check limitations (implementation of class setters )
        /**
         * @param string
         * @return boolean
         * checkname() uses a for loop to inspect every character of the received sring (its parameter) and return a boolean, 
         * if one of them is not aceptable, it is added to a new string that is after evaluated to return a boolean value
         */
        private boolean checkName(String name) {
            String nameiswrong="";

            for (int i = 0; i < name.length(); i++) {
                boolean b1 = Character.isAlphabetic(name.charAt(i));
                if (b1){}
                else {
                    if (name.charAt(i) == ' ' || name.charAt(i) == '-' ){}
                    else nameiswrong += name.substring(i, i + 1);
                }
            }
            if (nameiswrong.length() >= 1) return false;
            return true;
        }

        /**
         * @param String
         * @return boolean
         * follows the same pattern as checkname(), only it also consider digits
         */
        private boolean checkAccountNumber(String account) {
            String accountiswrong="";

            for (int i = 0; i < account.length(); i++) {
                boolean b1 = Character.isAlphabetic(account.charAt(i));
                boolean b2 = Character.isDigit(account.charAt(i));
                if (b1 || b2) { }
                else accountiswrong += account.substring(i, i + 1);
            }
            if (accountiswrong.length() >= 1) return false;
            return true;
        }
        
        /**
         * @param double
         * @return boolean 
         * check if the value is a positive double
         */
        private boolean checkBalance(double balance){
            if ( balance <= 0) return false;
            return true;
        }
    }