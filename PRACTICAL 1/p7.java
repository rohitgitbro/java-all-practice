public class p7{

public static void main(String ar[]){
	
	int a=Integer.parseInt(ar[0]);
	String unit = ar[1];
if(unit.equals("feet") ){
double meter = (a / 3.28);
	System.out.println(meter + " meter");

}
else if(unit.equals("meters") ){
double feet = (a / 3.28);
	System.out.println(feet + " feet ");

}
else{
System.out.println("the unit system is not recognized"+unit);
}

	
}}