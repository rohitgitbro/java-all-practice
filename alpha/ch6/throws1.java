public class throws1 {

    public static void fun(int a,int b) throws ArithmeticException{
        try{
            int c=a/b;

        }
        catch(Exception e){
            System.out.println("caught ex");
        }
        
    }
    public static void main(String args[]){
        int a=5;
        fun(a,0);

    }
    
}
