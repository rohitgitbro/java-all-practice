package pattern;

public class p17 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
                 
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            // 2nnd 
            for (int j = i; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
                
            }
            System.out.println();
        }
    }  
}
