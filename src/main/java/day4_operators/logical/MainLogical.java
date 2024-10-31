package day4_operators.logical;

public class MainLogical {
    public static void main(String[] args) {

        double baseSalary = 70000;
        int hoursWorked = 45;
        int yearsOfService = 5;


        // && AND
        //Both conditions are TRUE
        //true && false
        if(hoursWorked > 40 && baseSalary < 60000){
            System.out.println(" 1. Christian`s worked more than 40 hrs this week and his salary is less than Php 60,000");
        }else {
            System.out.println(" 1. Christian`s worked undertime  and his salary is Php 60,000 or more.");
        }

        // || OR
        //true || false
        if(yearsOfService <= 10 || baseSalary > 70000){
            System.out.println(" 2. Christian`s is either a long time employee or highly paid");
        }else {
            System.out.println(" 2. Christian`s is neither a long time employee nor highly paid");
        }


        //not equal to !=
        if(baseSalary != 60000){
            System.out.println(" 3. Christian`s base salary is not Php 60000.");
        }else {
            System.out.println(" 3. Christian`s base salary is Php 60000.");
        }
    }
}
