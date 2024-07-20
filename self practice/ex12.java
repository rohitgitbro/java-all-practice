/*  Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

import java.util.*;

public class ex12
{
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 3 number 1 by 1: ");
	double a = sc.nextDouble();
 	double b = sc.nextDouble();
	double c = sc.nextDouble();
	
	double avg = (a+b+c)/ 3 ; 
	System.out.println("avg is " +avg);


 }

}