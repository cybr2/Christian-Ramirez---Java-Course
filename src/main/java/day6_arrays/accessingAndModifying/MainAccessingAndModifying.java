package day6_arrays.accessingAndModifying;

import java.util.Arrays;

public class MainAccessingAndModifying {
    public static void main(String[] args) {
        String[] employeeNames = { "Christian", "Nan", "Luffy", "Boa"};
        double[] baseSalary = { 50000.75,60000.75,70000.75,80000.75 };
        int[] yearsOfService = { 5,7,3,11};
        boolean[] isLate = { true,false,true,false};
        int[] workingHours = { 35,40,45,50};


        displayEmployeeInfo();


        //10% increase for those employees who has more than 5 yrs of service
        System.out.println(" 1. 10% increase for those employees who has more than 5 yrs of service");
        for( int i = 0 ; i< yearsOfService.length;i++){
            if(yearsOfService[i] > 5){
                double originalSalary = baseSalary[i];
                baseSalary[i]*= 1.10;
                System.out.printf("%s received a 10%% raise. Original Salary: Php %.2f, New Salary: Php %.2f %n",
                                    employeeNames[i], originalSalary, baseSalary[i]);
            }
        }
        System.out.println();
        //10% deduction for those employees who are late
        System.out.println(" 2. 10% deduction for those employees who are late");
        for( int i = 0 ; i< employeeNames.length;i++){
            if(isLate[i]){
                double originalSalary = baseSalary[i];
                baseSalary[i]*= 0.90;
                System.out.printf("%s was late. Original Salary: Php %.2f, New Salary after deduction: Php %.2f %n",
                        employeeNames[i], originalSalary, baseSalary[i]);
            }
        }

        System.out.println();
        // update hours of a specific employee;
        System.out.println("3. Update working hours of a specific employee;");
        int employeeIndex = 0;
        workingHours[employeeIndex] = 30;
        System.out.println(employeeNames[employeeIndex] + " `s hours updated to: " + workingHours[employeeIndex] );
        System.out.println("Working hours:" + Arrays.toString(workingHours));

    }

    private static void displayEmployeeInfo() {
        String[] employeeNames = { "Christian", "Nan", "Luffy", "Boa"};
        double[] baseSalary = { 50000.75,60000.75,70000.75,80000.75 };
        int[] yearsOfService = { 5,7,3,11};
        boolean[] isLate = { true,false,true,false};
        int[] workingHours = { 35,40,45,50};

        System.out.println(" -- Employee Information --");
        for( int i =0; i< employeeNames.length;i++){
            String name = employeeNames[i];
            double salary = baseSalary[i];
            int yrs = yearsOfService[i];

            System.out.println("Employee:" + name);
            System.out.println("Current Salary:" + salary);
            System.out.println("Years of Service:" + yrs);
            System.out.println("Is the employee late? :" + Arrays.toString(isLate));
            System.out.println("Working hours:" + Arrays.toString(workingHours));

            System.out.println();
        }
    }
}
