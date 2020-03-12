package loops;

public class Main {
    public String oneToTen() {
        //DO NOT TYPE ABOVE HERE!!!
        String response = "*** Output ***";
        // HINT :: You need a for loop
        for (int i = 1; i < 100; i++) {
            response += "\n" + i;
        }
        return response;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.oneToTen());
//        int x = 1;
//        String y = "wakanda";
//        System.out.println(y + "\n" + x);
        long f = 124;
        short e = (short) f;
        System.out.println(e);
    }
}


