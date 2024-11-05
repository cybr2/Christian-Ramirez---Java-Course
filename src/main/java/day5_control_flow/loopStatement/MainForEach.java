package day5_control_flow.loopStatement;

public class MainForEach {
    public static void main(String[] args) {

        String[] employeeNames = { "Christian", "Nan", "Luffy", "Boa"};
        double[] baseSalary = {50000.75,60000.75,70000.75,80000.75 };
        int[] yearsOfService = { 5,7,3,11};

        System.out.println(" -- Employee Information --");
        for( int i =0; i< employeeNames.length;i++){
            String name = employeeNames[i];
            double salary = baseSalary[i];
            int yrs = yearsOfService[i];

            System.out.println("Employee:" + name);
            System.out.println("Current Salary:" + salary);
            System.out.println("Years of Service:" + yrs);
            System.out.println();
        }

        System.out.println(" -- List of Employees -- ");
        for(String name : employeeNames){
            System.out.println(" - Employee: " + name);
        }

        System.out.println(" -- Years of Service --");
        int totalYears = 0;
        for (int years : yearsOfService) {
            totalYears += years;
        }
        System.out.println(" - Total years of Service: " + totalYears);

    }
}
