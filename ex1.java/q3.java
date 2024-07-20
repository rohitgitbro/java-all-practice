/*
 package ex1.java;
3)
write a function which takes in 2 numbers and return the greater of 
those two
 */
import java.util.Scanner;
public class q3 {
    public static int greater(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String args[]){
        System.out.println("enter two number one by one");
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int result =greater(a,b);
        System.out.println("greater is" + result);


    }
    
}
