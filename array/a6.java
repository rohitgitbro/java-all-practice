// find the largest number in array

import java.util.*;

public class a6{
 public static void main(String args[])
 {
	 	System.out.println("enter the size of array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

	 	System.out.println("enter the element of array ");
		

		for(int i=0; i<n; i++)
		{
	 	System.out.println("enter element  : "+ (i+1) + ":");
		a[i] = sc.nextInt();
		}

		System.out.println("array elements : ");

		for(int i=0; i<n; i++)
		{
	 	System.out.println("your array is : " + (i+1) + ": " + a[i]);
		}
		

 }


}