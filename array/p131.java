
import java.util.*;
public class p131 {

    public static int lSearch(int a[],int key){
        for(int i=0; i<=a.length; i++){
            if(a[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int a[]= {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number u want to search");
        int key =sc.nextInt();
        
        int r = lSearch(a,key);
        if(r==-1)
        System.out.println("key is not present"); 
        else{
            System.out.println("key is found at index number:"+r);
        }

        

        
    }
    
}
