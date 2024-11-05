package Exercises.Banking_system;

import java.time.LocalDateTime;

public class Transaction {
    //attr
    private String transaction_id;
    private LocalDateTime date;
    private double amount;
    private String type;

    //constructor
    public Transaction(String transaction_id, LocalDateTime date, double amount, String type){
        this.transaction_id = transaction_id;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transaction_id +
                ", Date: " + date +
                ", Amount: " + amount +
                ", Type: " + type;
    }

    //getter and setters
    public String getTransaction_id(){
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id){
        this.transaction_id = transaction_id;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public void setDate(LocalDateTime date){
        this.date = date;
    }

    public double getAmount(){
        return  amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
