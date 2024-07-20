public class lastOccurence 
{

    public static int lastOccurence(int a[], int key, int si)
    {
        if(si == a.length)
        {
            return -1;
        }
        int isFound = lastOccurence(a,key,si+1);
        if(isFound == -1 && a[si] == key)
        {
            return si; 
        }

        return isFound;

    }
    public static void main(String args[])
    {
        int a[] = {1,5,3,4,7,8,5,6,4,2,6,3};
        System.out.println(lastOccurence(a,10,0));
    }
    
}
