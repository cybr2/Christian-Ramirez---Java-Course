package day5_control_flow.jumpStatement;

public class MainJumpStatement {
    public static void main(String[] args) {

        double baseSalary = 50000.75;
        for(int year = 1; year <=5; year++){
            if( year == 3){
                System.out.println("Skipping year 3 due to company policy");
                //continue
               break;
            }

            baseSalary *= 1.05;
            System.out.printf("Year: %d Php %.2f %n", year, baseSalary);
        }
    }
}
