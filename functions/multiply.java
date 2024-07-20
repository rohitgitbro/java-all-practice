// package functions;
import java.util.Scanner;

public class multiply {
    public static int multi(int a,int b){
        
        return a*b;
    }
    public static void main(String args[]){
        System.out.println("enter to number for multi");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       
        System.out.println("multi is "+ multi(a,b));



    }
    
}
