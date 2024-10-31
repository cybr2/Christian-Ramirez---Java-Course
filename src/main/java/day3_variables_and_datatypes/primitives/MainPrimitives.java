package day3_variables_and_datatypes.primitives;

public class MainPrimitives {
    public static void main(String[] args) {

        //variable declaration + variable name  = initialization


        //8 bit
        byte age = 29;
        System.out.println("Byte: " + age);

        //16 bit
        short departmentCode = 101;
        System.out.println("Short: " + departmentCode);

        char performanceGrade = 'B';
        System.out.println("Char: " + performanceGrade);

        //32 bit
        float sss = 2500.546216789f;
        System.out.println("Float: " + sss);

        int assetId = 1234567890;
        System.out.println("Integer: " + assetId);


        //64 bit
        long empId = 1234567890987654321L;
        System.out.println("Long: " + empId);

        double withHoldingTax = 25000.75546216789;
        System.out.println("Double: " + withHoldingTax);

        //boolean
        boolean isFullTimeEmployee = true;
        System.out.println("Boolean: " + isFullTimeEmployee);
    }
}
