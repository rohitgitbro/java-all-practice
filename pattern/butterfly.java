public class butterfly {

    private static int j;

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*( n - i); j++) {
                System.out.print(" ");
            }

             
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 2 nd for
        // 2nd pankiyu

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*( n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // for (int i = 1; i <= n; i++) {

    }
}