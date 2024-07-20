import java.util.*;
public class oddEven{
public static void main (String args[]){

 Scanner sc = new Scanner(System.in);
System.out.println(" enter number ");
 int num= sc.nextInt();
 String result = (num % 2 == 0) ? "even": "odd";
System.out.println(" the given number is "+ result);




}
}