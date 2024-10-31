package day4_operators.arithmetic;

public class MainArithmetic {
    public static void main(String[] args) {

        double baseSalary = 50000.75;
        double bonus = 25000.75;
        int yearsOfService = 10;

        //addition +
        double totalPay = baseSalary + bonus;
        System.out.println(" 1. Total pay for Christian Php: " + totalPay);

        //subtraction -
        double witHoldingTax = 10000.75;
        double netPay = totalPay - witHoldingTax;
        System.out.println(" 2. Net pay for Christian Php: " + netPay);

        //multiplication *
        double annualGrossSalary = baseSalary * 12;
        System.out.println(" 3. Gross pay for Christian Php: " + annualGrossSalary);

        //division /
        double averageSalaryIncreasePerAnnum = baseSalary / yearsOfService;
        System.out.println(" 4. Average Salary increase per annum for Christian Php: " + averageSalaryIncreasePerAnnum);

        //modulus %
        int daysUntilNextPayRaise  = 365 % 90;
        System.out.println(" 5. Days until next pay  Php: " + daysUntilNextPayRaise);


    }
}
