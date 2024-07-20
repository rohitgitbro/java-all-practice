import java.util.*;

public class primeNumber{
 public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
System.out.println("enter a number");

	int n = sc.nextInt();
	
boolean isPrime = true;
	
if(n<2){
isPrime = false;
 }

else{
for(int i=2; i*i <= n; i++){
if(n%i == 0){
  isPrime = false;
break;
 }
}
}
if(isPrime){
System.out.println(n + " number is  prime");}
else{
System.out.println(n+" number is  not prime");
}
}
}	
