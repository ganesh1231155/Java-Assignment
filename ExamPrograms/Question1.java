import java.io.*;
import java.util.*;

class rectangle
{
	void area(float l,float b)
	{
		System.out.println("Area of Rectangle is : "+(l*b));
	}
	
	void perimeter(float l,float b)
	{
		System.out.println("Perimeter of Rectangle is : "+(2*(l+b)));
	}
}

public class Question1
{
	public static void main(String[] arg)
	{
		float l,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of Rectangle :");
		l=sc.nextFloat();
		System.out.print("Enter Breadth of Rectangle :");
		b=sc.nextFloat();
		rectangle r=new rectangle();
		r.area(l,b);
		r.perimeter(l,b);
	}
}