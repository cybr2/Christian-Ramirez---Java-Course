package day2_java_syntax_basics;

import java.util.Scanner;

/*
        this is only for documentation purposes
*/
public class MainJavaBasics {
    public static void main(String[] args) {

        //this is an one line comment


        sayMessage();
        System.out.println();

        //calling without static keyword
        Message message = new Message();
        message.messageFromOtherClass();
        System.out.println();
        //calling with static keyword
        Message.messageWithStaticKeyword();

    }

    private static void sayMessage() {
        System.out.println("Say hello to the main class.");
    }



}
