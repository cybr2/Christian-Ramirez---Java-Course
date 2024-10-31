package day4_operators.ternary;

public class MainTernary {
    public static void main(String[] args) {

        /*
            condition ? expression1 : expression2
            if -> sout , else -> sout
         */

        int age = 76;
        System.out.println(age < 75 ? "Not yet retired" : "Retired");

        boolean isReceivedBonus = false;
        String receivedBonus = isReceivedBonus ? "Christian received the bonus" : "Christian did not received the bonus";
        System.out.println(receivedBonus);


    }
}
