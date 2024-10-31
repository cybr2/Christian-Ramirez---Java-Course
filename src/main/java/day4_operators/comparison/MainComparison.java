package day4_operators.comparison;

public class MainComparison {
    public static void main(String[] args) {

        int yearsOfService = 1;
        double baseSalary = 50000;
        double bonus = 25000;
        int hoursWorked = 35;
        double hourlyRate = 501;

        // equal to ==
        if(yearsOfService == 7){
            System.out.println(" 1. Christian has been with the company for exactly 7 yrs.");
        }else {
            System.out.println(" 1. Christian`s years of service is not 7 yrs.");
        }

        //not equal to !=
        if(baseSalary != 60000){
            System.out.println(" 2. Christian`s base salary is not Php 60000.");
        }else {
            System.out.println(" 2. Christian`s base salary is Php 60000.");
        }

        // greater than >
        if(hoursWorked > 40){
            System.out.println(" 3. Christian`s worked more than 40 hrs this week");
        }else {
            System.out.println(" 3. Christian`s undertime this week");
        }

        //less than <
        if(hourlyRate < 500){
            System.out.println(" 4. Christian`s hourly worked is less than Php 500");
        }else {
            System.out.println(" 4. Christian`s hourly worked is Php 500 or more.");
        }

        //greater than or equal to >=
        double totalPay = baseSalary + bonus;
        if(totalPay >= 75000){
            System.out.println(" 5. Christian`s total pay is Php 75,000 or more.");
        }else {
            System.out.println(" 5. Christian`s total pay is less than Php 75,000");
        }

        //less than or equal to
        if(yearsOfService <= 10){
            System.out.println(" 6. Christian`s years of service is less than 10 yrs.");
        }else {
            System.out.println(" 6. Christian`s years of service is more than 10 yrs.");
        }
    }
}
