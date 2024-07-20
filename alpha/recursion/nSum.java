public class nSum 
{
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int snm1  = sum(n-1);
        int s = n + snm1;
        return s;
    }
    public static void main(String args[])
    {
        System.out.println(sum(5));
    }

    
}
