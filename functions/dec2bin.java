
import java.util.*;
public class dec2bin
{
	
	public static void decTobin(int n)
	{	
		int myNum = n;
		int rem,bin=0,pow = 0;
		while(n>0)
		{
			rem = n%2;
			bin = bin + rem*((int)Math.pow(10,pow));
			pow++;
			n = n/2;
			}
     System.out.println("decimal of "+myNum+" is "+bin);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter decimal number :");
		int a = sc.nextInt();
		decTobin(a);




	}

}