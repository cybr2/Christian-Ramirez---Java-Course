package Exercises.Banking_system;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    //attr
    private final int account_number;
    private double balance;
    private final List<Transaction> transactionHistory;

    //constructor
    public Account(int account_number){
        this.account_number = account_number;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }



    public int getAccount_number(){
        return account_number;
    }

    //methods
    public void deposit(double amount){
        if ( amount > 0){
            balance += amount;

            Transaction transaction = new Transaction("TXN" +
                    (transactionHistory.size() + 1),
                    LocalDateTime.now(), amount, "deposit");
            transactionHistory.add(transaction);
            System.out.println("Deposited $" + amount + "successfully.");
            
        }
    }

    public void withdraw(double amount){
        if( amount > 0 && amount <= balance){
            balance -= amount;
            Transaction transaction = new Transaction("TXN" +
                    (transactionHistory.size() + 1),
                    LocalDateTime.now(), amount, "withdraw");
            transactionHistory.add(transaction);
            System.out.println("Withdrawn $" + amount + " successfully.");
        }else{
            System.out.println("Not enough balance");
        }
    }

    public double getBalance(){
        return balance;
    }

    public List<Transaction> getTransactionHistory(){
        return transactionHistory;
    }

}
