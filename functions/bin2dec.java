
import java.util.*;

public class bin2dec {

	public static void binTodec(int n)

	{
		int dec = 0, pow = 0, ld;
		do {
			ld = n % 10;
			dec = dec + (ld * (int) Math.pow(2, pow));
			pow++;
			n = n / 10;
		} while (n != 0);
		System.out.println("decimal num is: " + dec);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		int bn = sc.nextInt();
		binTodec(bn);

	}
}