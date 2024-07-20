public class p10 {

    public static void main(String args[]) {
        int n = 15;
        int a = 0, b = 1;
        System.out.print("the first 15 numbers in fibonaci series is :");

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}