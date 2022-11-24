import java.io.*;
import java.util.*;

 class MyNumber
 {
	int n;
	MyNumber()
	{
		n=0;
	}
	MyNumber(int n)
	{
		this.n=n;
	}
	
	void isNegative()
	{
		if(n<0)
		{
			System.out.println("\nNumber is Negative.");
		}
		else
		{
			System.out.println("\nNumber is not Negative.");
		}
	}
	
	void isPositive()
	{
		if(n>0)
		{
			System.out.println("\nNumber is Positive.");
		}
		else
		{
			System.out.println("\nNumber is not Positive.");
		}
	}
	
	void isZero()
	{
		if(n==0)
		{
			System.out.println("\nNumber is Zero.");
		}
		else
		{
			System.out.println("\nNumber is not Zero.");
		}
	}
	
	void isOdd()
	{
		if(n%2!=0)
		{
			System.out.println("\nNumber is Odd.");
		}
		else
		{
			System.out.println("\nNumber is not Odd.");
		}
	}
	
	void isEven()
	{
		if(n%2==0)
		{
			System.out.println("\nNumber is Even.");
		}
		else
		{
			System.out.println("\nNumber is not Even.");
		}
	}
 }
public class Question5
{
	public static void main(String[] arg)
	{
		int n=Integer.parseInt(arg[0]);
		MyNumber m=new MyNumber(n);
		m.isNegative();
		m.isPositive();
		m.isZero();
		m.isOdd();
		m.isEven();
	}
}