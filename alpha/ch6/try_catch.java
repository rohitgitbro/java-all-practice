public class try_catch {
    public static void main(String args[]){
        try{
            int a,b;
            a=5;
            b=a/0;

        }
        catch(Exception e){
            System.out.println("divid by zero\n"+e);
        }
        {
            System.out.println("execute catch statemnet");
        }
    }
    
} 