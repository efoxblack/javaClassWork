package myfirstpackage;

public class Main {

    public static void discountCalc(float price, float discount) {
        float discountAmt = ((discount / 100) * price);
        System.out.println("Your final discount price is: " + (price - discountAmt));
    }

    public static void main(String[] args) {
        //We invoked or called or used our method
        discountCalc(99, 10);

    }
}
