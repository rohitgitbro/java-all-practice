import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        double num1 = sc.nextDouble();
        System.out.println("enter first number");
        double num2 = sc.nextDouble();

        System.out.println("operations");
        System.out.println("1:addition");
        System.out.println("2:sub");
        System.out.println("3:mul");
        System.out.println("4:division");
        System.out.println("choose op (1-4)");

        int choice = sc.nextInt();
        double result;
        switch (choice) {
            case 1:result=num1+num2;
            System.out.println(result);
            break;

            case 2:result=num1-num2;
            System.out.println(result);
            break;

            case 3:result = num1 * num2;
            System.out.println(result);
            break;

            case 4:result=num1/num2;
            System.out.println(result);
            break;

            default:System.out.println("invalid choice");



        }

    }

}
