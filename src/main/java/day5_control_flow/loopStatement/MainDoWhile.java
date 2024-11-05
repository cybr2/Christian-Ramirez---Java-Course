package day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {

        // do -> check validation
        System.out.println("Training Modules Completed:");
        int trainingModule = 3;
        do {
            System.out.println("Completed Module: " + trainingModule);
            trainingModule++;
        }while(trainingModule < 10);
    }
}
