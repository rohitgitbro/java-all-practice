public class pr22 {
    public static void main(String args[]){
        fish f = new fish();
        f.eat();
    }
    static class animal
    {
        int color;
        void eat()
        {
            System.out.println("ani eat");
        }
    }
    static class fish extends animal{
        void swim(){
            System.out.println("swim");
        }
    }
}
    

