package day5_control_flow.loopStatement;

public class MainWhileLoop {
    public static void main(String[] args) {

        int yearsOfService = 3;
        int performanceRating = 2;
        boolean isPromotionEligible = false;
        while(!isPromotionEligible){
            // true || true && false
            if(yearsOfService >= 10|| (yearsOfService >=5 && performanceRating >= 3)){
                isPromotionEligible = true;
                System.out.println("Employee is now eligible for promotion.");
            }else{
                yearsOfService++;
                System.out.println("Years of Service:" + yearsOfService);
            }
        }
    }
}
