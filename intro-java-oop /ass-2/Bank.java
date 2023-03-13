/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Assignment2_200539617;

/**
 *
 * @author layladesouzabarbosa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Hashtable;


public class Bank {

    //instatiating private variables for internal use of data 
    private String bankName;
    private final  String[] BRANCH_LOCATIONS={"Midtown", "Downtown", "Lakeshore", "North York", "Etobicoke"};
    private String branchLocation;
    private List<Account> accounts;
    private Scanner input = new Scanner(System.in);

    //constructors
    public Bank(String bankName, String branchLocation) throws Exception {
        setBankName(bankName);
        setBrachLocation(branchLocation);
        this.accounts = new ArrayList<>();
    }
    public Bank (){}

    //getters
    public String getBankName() {
        return bankName;
    }

    public String getBranchLocation() {
        return this.branchLocation;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    //setters
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
     /**
     * @param branchLocation String
     * @throws Exception
     * this method uses a private method that returns a boolean value to evaluate if a branch location is acceptable, 
     * if not it throws an exception error 
     */
    public void setBrachLocation(String branchLocation) throws Exception{
        if (isBranchLocationAvailable(branchLocation)) this.branchLocation=branchLocation;
        else throw new Exception("I am sorry, this branch location is not available");
    }

    /**
     * @param brachname Sttring
     * @return boolean
     * private method to check if branch name belong to a pre-determined list of options, receives a String as parameter an return 
     * a boolean
     */
    private boolean isBranchLocationAvailable(String brachname){
        return Arrays.asList(BRANCH_LOCATIONS).contains(brachname);
    }
    
    /**
     * @param accountNumber String
     * @return Account ob ject
     * public methhod to return an account, uses a string parameter that corresponds to the account number, if a correspondent account 
     * is not found returns null
     */
    public Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    

    /**
     * @param command String
     * @throws Exception
     * public method to parse commands, takes a string as a parameter and uses switch to invoke private correspondent methods, also
     * has a default message in case the parameter is not correspondent to any method
     */
    public void parseCommand(String command) throws Exception {
        command.toLowerCase().trim();
        switch(command){
            case "add account": 
                addAccount();
            break;
            case "view accounts": 
                viewAccounts();
            break;
            case "account details": 
                accountDetails();
            break;
            case "modify account": 
                modifyAccount();
            break;
            case "delete account": 
                deleteAccount();
            break;
            case "summary":
                summary();
            break;
            case "help" :
                help();
            break;
            default :
            System.out.print("I am Sorry this information is not an option");
        }
    }

    /**
     * @throws Exception 
     *private method to create an account object using inputed data from the user, then add it to the accounts list 
     */
    private void addAccount() throws Exception {
        System.out.println("Type new account name");
            String accountName = input.nextLine();
        System.out.println("Type new account number");
            String accountNumber = input.nextLine();
        System.out.println("Type new account balance");
            Double balance = input.nextDouble();
        Account acc= new Account(accountName, accountNumber, balance);
        accounts.add(acc);
    }

    /**
     * @return String
     *private method for asking data to the user, used to simplify the proccess 
     */
    private String askForAccount(){
        System.out.println("Type account number");
        return input.nextLine();
    }

    /**
     * method to print all the information related to every account object in the list of the current branch using the forEach() 
     * method as a helper
     */
    private void viewAccounts(){
    accounts.forEach(account -> {
            System.out.println(account.toString());
            System.out.println("--------------------------------------");
        }); 
    }

    /**
     * method to output a specific account object properties, takes advantage of 2 other private methods askForAccount() and 
     * getAccountByNumber()
     */
    private void accountDetails(){
        String accountNumber = askForAccount();
        Account acc = getAccountByNumber(accountNumber);
        System.out.println(acc.toString());
    }

    /**
     * @throws Exception
     *follows the pattern of accountDetails() taking advantage f internal methods. In addition it uses a switch controler to invoke 
     account methods based on data inputed from the user 
     */
    private void modifyAccount() throws Exception{
        String accountNumber = askForAccount();
        Account acc = getAccountByNumber(accountNumber);
        System.out.println("Chose data to modify: account name = 1, account number = 2 account balance = 3");
        int modify= input.nextInt();
         switch(modify){
          case 1: 
            System.out.println("Type new account name, remember only alphabetical characters, spaces and hyphens are aceptable:");
            String newName= input.nextLine();
            acc.setName(newName);
        break;
        case 2: 
            System.out.println("Type new account number, remember only alphanumerical characters are aceptable:");
            String newNumber= input.nextLine();
            acc.setAccountNumber(newNumber);;
        break;
        case 3: 
            System.out.println("Type new account balance, remember only positive values are aceptable:");
            Double newBalance= input.nextDouble();
            acc.setBalance(newBalance);
        break;
        }
    }

    /**
     * another method that follows accountDetails() pattern. Furthermore it prints a confirmation message ad collects the user response
     *  prior to declaring the specified account as null, being  it comparable as deleted, since you cannot delete an object.
     */
    private void deleteAccount(){
        String accountNumber= askForAccount();
        System.out.print(" This is the account selected.");
        Account acc2 = getAccountByNumber(accountNumber);
        System.out.printf("'%S' %n", "ATENTION: Deleting an account is a permanent action.");
        String decision = input.nextLine();
        if (decision == "y") accounts.remove(acc2);
        else return;
    }

    //
    /**
     * display of the number of accounts created, the sum of all balances and the average balance for all accounts
     */
    private void summary(){
        int accountsTotal= accounts.size();
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        double average = (double)(totalBalance / accountsTotal); 

        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf("                            Accounts Summary                                     %n");
        System.out.printf("----------------------------------------------------------------------------------%n");
        
        System.out.printf(" %-40s | %-22s |   %24s %n", "Number of accounts", "sum of all balances", "average balance");
        System.out.printf(" %-40d | CAD$ %18.2f | CAD$ %10.2f %n", accountsTotal, 
                totalBalance, average);
    }


    /**
     * Created a hashtable to store the menu options and descriptions in a key,value pair. Then use the help of forEach() and printf() 
     * methods to output the information in a nice readable way for the user.Lastly, gave the user the key to return to the main menu.
     */
    private void help(){
        Map<String, String> functions = new Hashtable<>();
        functions.put("Add Account", "You will be asked you to input 3 pieces of information, account name(alphabetical characters, spaces and hyphens), number(only alphanumerical characters) and balance(must be positive value), in order to create a new account in the current branch location database. The requirements for the new account information will not be provided at this moment.  If the provided information is valid, a new account will automatically be created. Otherwise, you will be removed from the program.");
        functions.put("View accounts", "Output the information for every account in this branch location database.");
        functions.put("Account details", "You will be asked for an account number. If the number corresponds to an account in this branch location database, all information (account name, number and balance) will be outputed.");
        functions.put("Modify account", "You will be asked for an account number. If the number corresponds to an account in this branch location database, you will be asked to select wich information (account name, number and balance) you are willing to modify. You can only modify one information at a time. Once you select the information, you will be asked to input the new piece of information, a message with the new information requirements will also be provided. If the provided information is valid, it will automatically be updated. Otherwise, you will be removed from the program.");
        functions.put("delete accounts", "You will be asked for an account number. If the number corresponds to an account in this branch location database, all information related will be printed. You will then be asked to confirm the deleting of the account. There is no way to undo this action, if you confirm the account data will be deleted and you will be redirected to the main menu. If you do not confirm, you will be redirected immediatelly to the main menu.");
        functions.put("summary", "Output a table whith 3 pieces of information about this branchlocation database: total number of accounts, the sum of balance of all accounts, and an average of the balance for all accounts. atention: this information is only related to this branch location.");
        functions.put("exit", "Once you type exit in the main menu, the program will end and you will not have access to this branch location information. The return to the database a new login must be done.");
        
        
        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf("                            Welcome to " + this.getBankName() + " Bank                        %n");
        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf("                            General Commands Manual                               %n%n");
        
        System.out.printf(" The options are not case sensitive. However, it does require you to type the option correctly.%n%n%n");
        functions.forEach((key, value) -> {
            System.out.printf(" - %S %n - %20s %n%n", key, value);
        }); 
        System.out.printf("   To return to main menu, press Q                        %n%n");
            String leave = input.nextLine();
            if (leave.toLowerCase().contentEquals("q")) return;
    }

}



