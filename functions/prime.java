// number isprime or not

import java.util.*;

public class prime
{

	public static boolean isprime(int n)
	{
		if(n==2)
		{
			return true;
		}
		boolean isprime = true;
		for(int i=2; i<=Math.sqrt(n); i++)
       {
			if(n%i == 0)
			isprime = false;
			break;
            }
	    return	isprime;

}
public static void primeInRange(int r){
	for(int i=2; i<=r; i++){
    if(isprime(i)){
		System.out.print(i+" ");}}
}
   public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		/*System.out.println("enter number :");

		int a = sc.nextInt();
		System.out.println(isprime(a));*/
		primeInRange(16);
    }
}