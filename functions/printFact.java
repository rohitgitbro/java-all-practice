// package functions;
import java.util.Scanner;
public class printFact {
    public static void factorial(int n){
        if(n<0){
            System.out.println("invalid value");
            return;

        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }

            System.out.println(fact);
            return;
        }

    /**
     * @param args
     */
    public static  void main(String args[]){
        System.out.println("enter number");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        factorial(n);

    }
    
}
