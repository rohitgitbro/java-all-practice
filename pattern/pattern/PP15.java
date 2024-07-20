package pattern;

public class PP15 {

    public static void main(String[] args) {
        int numRows = 3; // You can change this value for more rows

        for (int i = numRows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
    }
}
