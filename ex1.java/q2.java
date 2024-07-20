
// package ex1.java;
// write a function to print the sum of all odd numbers from 1 
// to n
import java.util.Scanner;

public class q2 {
    public static void printSumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;

        }
        System.out.println("sum of all odd no from 1 to "+n+ "is" + sum);


    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter last n number ");
        int n = sc.nextInt();
        printSumOfOdd(n);
        




    }

}
