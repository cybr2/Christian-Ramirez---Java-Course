package Exercises.Banking_system;

public class Customer {
    //attr
    private String name;
    private String address;
    private Account account;

    //constructor
    public Customer(String name, String address, Account account){
        this.name = name;
        this.address = address;
        this.account = account;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getAccountNumber(){
        return account.getAccount_number();
    }
}
