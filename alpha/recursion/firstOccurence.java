// write a function to find  first occurence of number 

public class firstOccurence 
{
    public static int firstOccurence(int a[], int key, int si)
    {
        if(si == a.length )
        {
            return -1;
        }
        if(a[si] == key)
        {
            return si;
        }
        return firstOccurence(a,key,si+1);
    }
    public static void main(String args[])
    {
        int a[] = {1,2,5,7,8,9,4,5};
        System.out.println(firstOccurence(a,4,0));
    }
    
}
