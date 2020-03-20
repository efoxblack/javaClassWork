package palindrome;

import java.util.Scanner;

public class PalindromeProj {

    public static void palindromeCheck() {
        String userNum;
        String reverse = "";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 5 digits, any of your choice, but try to make a Palindrome.");
        userNum = userInput.nextLine();
        int length = userNum.length();
        int i;
        for (i = length - 1; i >= 0; i--) {
            reverse = reverse + userNum.charAt(i);
        }
        if (userNum.equals(reverse) && (length == 5)) {
            System.out.println("You entered a 5 character palindrome!");
            i = 0;
        } else {
            System.out.println("Not a 5 character palindrome, Try again!");
            palindromeCheck();
        }
    }

    public static void main(String[] args) {
        palindromeCheck();
    }
}
