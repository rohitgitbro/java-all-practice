// package pattern;
// diamond pattern
/*
  *
 ***
*****
*****
 ***
  *
 */

public class diamondPattern {
    public static void main(String args[]){
        int n=3;
        for(int i=1; i<=n; i++){
            // spaces 
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
            
            // 2nd n to 1 for loop
            for(int i=n; i>=1; i--){
                // spaces 
                for(int k=1; k<=n-i; k++){
                    System.out.print(" ");
                }
                for(int k=1; k<=2*i-1; k++){
                    System.out.print("*");
                }

            System.out.println();
            
        }
    }
}
    
    
