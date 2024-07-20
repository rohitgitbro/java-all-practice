// package functions;

import java.util.Scanner;

public class calculateSum {

    public static int Sum(int a,int b){//parameter or formal parameter
        int sum =a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=Sum(a,b); // argument or actual parameter
        System.out.println("the sum is "+sum);
        

    }
    
}
