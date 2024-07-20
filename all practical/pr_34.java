import java.util.Scanner;

public class pr_34 {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.print("Enter an integer: "); String input = sc.nextLine();
try {
int number = Integer.parseInt(input); System.out.println("Entered number: " + number);
} catch (NumberFormatException e) {

System.out.println("Invalid input! Please enter a valid integer ");
}
}
}

