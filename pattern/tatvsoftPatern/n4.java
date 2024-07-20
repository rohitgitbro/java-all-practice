package tatvsoftPatern;

public class n4 {
    public static void main(String[] args) {
        int c=10;
        int n= 4;
        for (int i = 1; i <=n; i++) {
            for (int j =n; j >= i; j--) {
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
}
