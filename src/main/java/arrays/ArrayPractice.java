package arrays;

import java.util.ArrayList;

public class ArrayPractice {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Hot Cheetos");
        groceryList.add("Toilet Paper");
        groceryList.add("Eggs");
        groceryList.add("Milk");

        for (String x: groceryList) {
            System.out.println(x);
        }
    }
}
