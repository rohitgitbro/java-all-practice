// wap to print sum of 1st n natural number
import java.util.Scanner;
public class stNnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int sum=0;
        for(int i=1;i<=n;i++)
        {  
             sum =sum+i;

            }
            System.out.println("the sum is");
            System.out.println(sum);
    }
    
}
