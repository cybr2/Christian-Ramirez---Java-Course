package day6_arrays.multiDimensional;

public class MainMultiDimensional {
    public static void main(String[] args) {

        //0,        1,      2,          3,          4,        5                  6
        // name, salary, hours worked, hourly rate, bonus, years of service, is late
        Object[][] employeeData = {
                {" Christian",50000.75, 40, 500.75, 25000.75, 10, false},
                {" Nan",60000.75, 45, 1000.75, 20000.75, 5, true},
                {" Luffy",70000.75, 50, 1500.75, 30000.75, 3, false},
                {" Boa",80000.75, 55, 2000.75, 10000.75, 7, true},
        };


        System.out.println(" -- Initial Employee Data");
        displayEmployeeData(employeeData);
    }

    private static void displayEmployeeData(Object[][] employeeData) {

        for(Object[] employee : employeeData){
            System.out.println("Employee Name: " + employee[0]);
            System.out.printf("Salary: Php %.2f %n ", (double)employee[1]);
            System.out.println("Hours of Worked: " + employee[2]);
            System.out.printf("Hourly Rate: %.2f %n " , (double)employee[3]);
            System.out.println("Bonus: " + employee[4]);
            System.out.println("Years of Service: " + employee[5]);
            System.out.println("is Late: " + employee[6]);
            System.out.println();

        }
    }
}
