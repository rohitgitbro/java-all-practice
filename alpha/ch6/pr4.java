public class pr4 {
    public static void main(String args[])
    {
        int num,count = 0;
        int a[] = new int[5];
        // if(a[i]!=5){

        // }
        for(int i=0; i<args.length; i++){
            // Scann
            num = Integer.parseInt(args[i]);
            a[i] = num;
        }
        for(int i=0; i<args.length; i++){
            if(a[i] < 0){
                count++;

            }
        }
        System.out.println("the total num of negetive number is "+count);
    }
    
}
