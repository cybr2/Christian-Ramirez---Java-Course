package day5_control_flow.loopStatement;

public class MainForLoop {
    public static void main(String[] args) {


        double salary = 50000.75;
        int yearsOfService = 7;

        // projecting your annual salary for the next 5 yrs
        double annualGrossSalaryIncrease = 0.05;
        for(int year = 1; year <= 5; year++){
            salary *= (1 + annualGrossSalaryIncrease);

            yearsOfService++;
            System.out.printf("Year: %d - Salary: Php %.2f - Years of Service: %d %n",
                                year,       salary              ,yearsOfService);
        }
    }
}
