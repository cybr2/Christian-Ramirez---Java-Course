package day5_control_flow.decisionMaking;

public class MainSwitchStatement {
    public static void main(String[] args) {

        int yearsOfService = 10;
        switch(yearsOfService){
            case 0:
            case 1:
                System.out.println("Employee Level: Trainee");
                break;
            case 2:
            case 3:
                System.out.println("Employee Level: Junior");
                break;
            case 4:
            case 5:
                System.out.println("Employee Level: Intermediate");
                break;
            case 6:
            case 7:
                System.out.println("Employee Level: Senior");
                break;

            default:
                System.out.println("Employee Level: Expert");
                break;
        }
        System.out.println();
        String department = "SaLeS";

        switch(department.toLowerCase()){

            case "it":
                System.out.println("Department: IT");
                break;
            case "hr":
                System.out.println("Department: HR");
                break;
            case "pr":
                System.out.println("Department: PR");
                break;
            case "sales":
                System.out.println("Department: Sales");
                break;
            default:
                System.out.println("Invalid Department Name");
                break;
        }
    }
}
