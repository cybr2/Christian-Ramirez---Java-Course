package day6_arrays.initializedAndDeclaring;

public class MainDeclaringAndInitialized {

    public static void main(String[] args) {
        // data type [] -> variable name = { list of arrays }"


        String[] employeeNames = { "Christian", "Nan", "Luffy", "Boa"};
        double[] baseSalary = { 50000.75,60000.75,70000.75,80000.75 };
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

        System.out.println();

        System.out.println(" -- Base Salary -- ");
        for(double salary : baseSalary){
            System.out.printf("%.2f,", salary);
        }
    }

}
