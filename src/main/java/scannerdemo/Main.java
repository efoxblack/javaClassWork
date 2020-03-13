package scannerdemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What about your number?");

        int phoneNum = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Hey, What's your name babe.");

        String name = userInput.nextLine();

        System.out.println("Alright I'm gonna hit you up then " + name + ". Your phone number is, " + phoneNum + ", right?");
    }
}
