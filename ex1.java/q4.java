// package ex1.java;
// write a function that takes in the radius as input and returns the 
// circumference  of a circle
import java.util.Scanner;
public class q4 {
    // private static final double pi = 3.14;
    public static double findCircumference(int r){
       double result= 2*Math.PI*r;

       return result;
    }
    public static void main(String args[]){
        System.out.println("enter radious");
        Scanner sc= new Scanner(System.in);
        int r =sc.nextInt();

        double result=findCircumference(r);
        System.out.println("the circumference of circle with radious " +r+ " is "+result);




    }
    
}
