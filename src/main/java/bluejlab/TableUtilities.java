package bluejlab;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int dimensions = 16;
        for (int x = 0; x <= dimensions; x++){
            result += "  " + x + " |";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
