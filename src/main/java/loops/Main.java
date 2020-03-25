package loops;

public class Main {
//    public String oneToTen() {
//        //DO NOT TYPE ABOVE HERE!!!
//        String response = "*** Output ***";
//        // HINT :: You need a for loop
//        for (int i = 1; i < 100; i++) {
//            response += "\n" + i;
//        }
//        return response;
//    }
//    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.oneToTen());
////        int x = 1;
////        String y = "wakanda";
////        System.out.println(y + "\n" + x);
//        long f = 124;
//        short e = (short) f;
//        System.out.println(e);
//    }

//    public String even(Integer num){
//        //DO NOT TYPE ABOVE HERE!!!
//        String response = "*** Output ***";
//        for (int n = 2; n <= 22; n++) {
//            if ((n % 2) == 0) {
//                response += "\n" + n;
//            }
//        }
//        return response;
//    }
//
//    //DO NOT TYPE BELOW HERE!!!
//    public static void main(String[] args){
//        Main main = new Main();
//        System.out.println(main.even(20));
//    }


//    public String printArray(String[] input){
//        String response = "*** Output ***";
//        //DO NOT TYPE ABOVE HERE!!!
//        // Place your code here
//        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        for (String s : breakfast) {
//            response += "\n" + s;
//        }
//        return response;
//    }
//    //DO NOT TYPE ABOVE HERE!!!
//    /** DO NOT EDIT THIS CODE **/
//    public static void main(String[] args){
//        Main main = new Main();
//        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        System.out.println(main.printArray(breakfast));
//    }

    public String printArray(String[] input){
        String response = "*** Output ***";
        //DO NOT TYPE ABOVE HERE!!!
        // Place your code here
//        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            response = response + "\n" + s;
        }
        return response;
    }
    //DO NOT TYPE ABOVE HERE!!!
    /** DO NOT EDIT THIS CODE **/
    public static void main(String[] args){
        Main main = new Main();
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        System.out.println(main.printArray(breakfast));
    }
}


