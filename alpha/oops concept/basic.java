public class basic{
    public static void main(String args[]){
        Pen p1=new Pen(); // created pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // p1.setColor("yellow");
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    private String color;
     private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;

    }

    void setTip(int newTip){
        this.tip = newTip;

    }

}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int maths, int chem){
        percentage = (phy+chem+maths)/3;
    }}