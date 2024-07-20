package tatvsoftPatern;

public class num {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            // star 
            for (int j =n-1; j >= i; j--) {
                System.out.print("*");
            }

            // num
            int m=4*i-3;
           for (int j =1; j <=2*i-1; j++) {
                System.out.print(m);
                m-=2;
            }
            System.out.println();
        }
    }
}
