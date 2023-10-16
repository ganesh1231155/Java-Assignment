import java.util.*;


class shape{
	Scanner sc=new Scanner(System.in);
	void area(float a){
		System.out.println("Area of Square : "+a*a);
	}
	void area(float a,float b){
		System.out.println("Area of rectangle : "+a*b);
	}
	void area(){
		System.out.println("Enter Radious : ");
		float a=sc.nextFloat();
		System.out.println("Area of circle is :"+3.14*a*a);
	}
	
	
}

public class Question7{
	public static void main(String sk[]){
		shape s=new shape();
		s.area(25);
		s.area(25,12);
		s.area();
	}
}