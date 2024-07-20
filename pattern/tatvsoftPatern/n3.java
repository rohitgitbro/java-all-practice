package tatvsoftPatern;

public class n3 {
    
        public static void main(String[] args) {
            
                
                    int a = 1, b = 1;
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(a + " ");
                            int temp = a;
                            a = b;
                            b = temp + b;
                        }
                        System.out.println();
                    }
                }
            }
        
    
