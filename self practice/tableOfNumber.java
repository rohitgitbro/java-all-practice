import java.util.Scanner;

public class tableOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        // for(int i=1;i<=10;i++)
        // {
        //     int t=i*n;
        //     System.out.println(t);
        // }

        for(int i=1;i<=10;i++)
        {
           
            System.out.println(n+"x" +i+"="+ (n*i));
        }
    }

}
