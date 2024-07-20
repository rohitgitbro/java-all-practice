
/*
 package ex1.java;
1)
wap enter 3 number from the user & make a function to print
their avg
 */
import java.util.Scanner;

public class q1 {
    public static double average(int sum,int n ){
        double avg=(double)sum/n;
        return avg;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how  many number u want to enter");
        int n = sc.nextInt();
        // int n=3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("enter value " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        double avg=average(sum,n);
        System.out.println("the average of n number is "+avg);

    }

}

// public class q1 {
// public static void main(String args[]){
// Scanner sc= new Scanner(System.in);
// int n=3;
// for(int i=1; i<=3; i++){
// System.out.print("enter value "+ i + ": ");
// int value=sc.nextInt();
// System.out.println(" the value enter is" +value);
// }

// }

// }
