public class new1{
    public static void main(String args[]){
        String s1="shiddat";
        String s2="shiddat";
        String s3=new String("shiddat");

        if(s1==s2){
            System.out.println("strings are equal");
                }
        else {
         System.out.println("strings are not  equal");
        }
        
        if(s1==s3){
            System.out.println("strings are   equal");
        }
        else{
            System.out.println("strings are not  equal");
        }

        if(s1.equals(s3)){
            System.out.println("strings are   equal");
        }
        else{
            System.out.println("strings are not  equal");
        }

    }
}