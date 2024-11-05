package Exercises.Banking_system;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static final HashMap<Integer, Account> accounts = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            System.out.println("Welcome to the banking System!");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6 Exit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    viewTransactionHistory();
                    break;
                case 6:
                    System.out.println("Thank you for using the Banking System");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, Try again");
            }

        }
    }

    private static void createAccount() {
        scanner.nextLine(); // Consume any leftover newline before starting input
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine(); // Read customer name
        System.out.println("Enter customer address: ");
        String address = scanner.nextLine(); // Read customer address
        System.out.println("Enter account number: ");
        int account_number = scanner.nextInt(); // Read account number
        // This line consumes the newline character left by nextInt
        scanner.nextLine();

        Account account = new Account(account_number);
        accounts.put(account_number, account);
        Customer customer = new Customer(name, address, account);

        System.out.println("Account created successfully for " + customer.getName());
    }


    private static void depositMoney(){
        System.out.println("Enter account number:");
        int account_number = scanner.nextInt();
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        Account account = accounts.get(account_number);
        if(account != null){
            account.deposit(amount);
        }else{
            System.out.println("Account not found.");
        }
    }

    private  static  void withdrawMoney(){
        System.out.println("Enter account number");
        int account_number = scanner.nextInt();
        System.out.println("Enter amount to withdraw");
        double amount = scanner.nextDouble();

        Account account = accounts.get(account_number);
        if(account != null){
           account.withdraw(amount);
        }else{
            System.out.println("Account not found");
        }
    }

    private static void checkBalance(){
        System.out.println("Enter account number");
        int account_number = scanner.nextInt();

        Account account = accounts.get(account_number);
        if(account != null){
            System.out.println("Current Balance: " + account.getBalance());
        }else{
            System.out.println("Account not found");
        }
    }

    private static void viewTransactionHistory() {
        System.out.println("Enter account number");
        int account_number = scanner.nextInt();

        Account account = accounts.get(account_number);
        if (account != null) {
            List<Transaction> transactionHistory = account.getTransactionHistory();

            // Reverse the transaction history for descending order
            Collections.reverse(transactionHistory);

            System.out.println("Transaction history:");
            for (Transaction transaction : transactionHistory) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("Account not found");
        }
    }
}
