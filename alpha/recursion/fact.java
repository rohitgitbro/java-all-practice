public class fact 
{
    public static int fact(int n)
    {
        if(n<0)
        {
            return 2;
        }
        if(n==0)
        {
            return 1;
        }
        int nm1=fact(n-1);
        int f = n*nm1;
        return f;
    }
    public static void main(String args[])
    {
        int n;
        System.out.println(fact(5));
    }

    
}
