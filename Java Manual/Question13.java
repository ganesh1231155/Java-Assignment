import java.util.*;

class box{
			Scanner sc=new Scanner(System.in);

	void area(){
		
		System.out.println("Area method in base class box");
		System.out.print("Enter length :");
		float length=sc.nextFloat();
		System.out.print("Enter breadth :");
		float breadth=sc.nextFloat();
		System.out.println("Area of Box having length "+length+" and breadth"+breadth+" is :"+length*breadth);
	}
}

class mannual3 extends box{
	void area(){
		System.out.println("Area method in derived class mannual3");
		System.out.print("Enter length :");
		float length=sc.nextFloat();
		System.out.print("Enter breadth :");
		float breadth=sc.nextFloat();
		System.out.println("Area of Box having length "+length+" and breadth "+breadth+" is :"+length*breadth);
	}
}

public class Question13{
	public static void main(String sk[]){
		mannual3 m=new mannual3();
		m.area();
	}
}