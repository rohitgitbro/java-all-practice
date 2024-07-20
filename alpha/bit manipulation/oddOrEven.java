public class oddOrEven{

    public static void checkOddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number  ");
        }else{
            System.out.println("odd  number  ");
        }


    }
    public static void main(String args[]){
        checkOddOrEven(3);
        checkOddOrEven(10);
        checkOddOrEven(31);
        
    }
}