import java.io.*;
import java.util.*;

public class Question2
{
	public static void main(String[] arg)
	{
		float r,h;
		int a,b,c,arm,n;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("\n\n1.Calculate Volume of Cylinder.\n2.Factorial of Number.\n3.To Check Number is Armstring Number or not.\n4.Exit.\nEnter Your Choice :");
			n=sc.nextInt();
			switch(n)
			{
				case 1 :
						System.out.print("Enter Radious of Cylinder :");
						r=sc.nextFloat();
						System.out.print("Enter Height of Cylinder :");
						h=sc.nextFloat();
						System.out.println("\nVolume of Cylinder is : "+(3.14f*r*r*h));
				break;
				
				case 2:
						System.out.print("Enter Number to find Factorial of number : ");
						a=sc.nextInt();
						b=1;
						for(int i=1;i<=a;i++)
						{
							b=b*i;
						}
						System.out.println("\nFactorial of "+a+" is "+b);
				break;
				
				case 3:
						System.out.print("Enter Number to check Armstrong or not : ");
						a=sc.nextInt();
						b=0;
						for(int i=a;i>0;i/=10)
						{
							b+=((i%10)*(i%10)*(i%10));
						}
						if(a==b)
						{
							System.out.println("\nEntered number "+a+" is an Armstrong number.");
						}
						else
						{
							System.out.println("\nEntered number "+a+" is not an Armstrong number.");
						}
				break;
				
				case 4:
						System.exit(0);
				break;
				default:
						System.out.println("Invalid Input.");
			}
		}
	}
}