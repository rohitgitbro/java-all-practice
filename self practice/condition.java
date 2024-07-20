import java.util.Scanner;

public class condition {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button= sc.nextInt();
            // if(age>18)
            // {
            //     System.out.println("adult");
            // }
            // else{
            //     System.out.println("not adult");
            // }

        switch(button){
            case 1:System.out.println("hello");
            break;

            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjour");
            break;
            default:System.out.println("invalid button");
            
        }
        
    }
    
}
