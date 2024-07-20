//  Write a Java program to swap two variables.

import java.util.*;

public class ex15
{
  public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
				System.out.println("enter 2 value 1 by 1" );

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("besfore swapping :a= " + a + "\t" +b );
	   int temp;
		temp = a;
		
		 a = b ;
		 b = temp ;
		System.out.println("after swapping :a= " + a + "\t" +b );

	}
}