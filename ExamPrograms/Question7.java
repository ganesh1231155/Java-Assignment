import java.io.*;
import java.util.*;

class Matrix
{
	int r,c,d,u,l;
	int[][] m;
	Scanner sc=new Scanner(System.in);
	Matrix()
	{
		System.out.print("Enter number of rows :");
		r=sc.nextInt();
		System.out.print("Enter number of columns :");
		c=sc.nextInt();
		m=new int[r][c];
		System.out.println("Enter Values in Matrix.");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("M["+i+"]["+j+"]=");
				m[i][j]=sc.nextInt();
			}
		}
	}
	
	void sumOfDiagonal()
	{
		d=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
				d+=m[i][j];
				}
			}
		}
		System.out.println("\nSum of Diagonal Elements is : "+d);
	}
	
	void sumOfUpperDiagonal()
	{
		u=0;
		for(int i=0;i<r;i++)
		{
			for(int j=i+1;j<c;j++)
			{
				
				u+=m[i][j];
			}
		}
		System.out.println("\nSum of Upper Diagonal Elements is : "+u);
	}
	
	void sumOfLowerDiagonal()
	{
		l=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<i;j++)
			{
				l+=m[i][j];
			}
		}
		System.out.println("\nSum of Lower Diagonal Elements is : "+l);
	}
}

public class Question7
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		Matrix m=new Matrix();
		while(true)
		{
			System.out.print("\n\n1.Sum of Diagonal elements.\n2.Sum of Upper Diagonal elements.\n3.Sum of Lower Diagonal elements.\n4.Exit\nEnter Your Choice :");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
						m.sumOfDiagonal();
				break;
				
				case 2:
						m.sumOfUpperDiagonal();
				break;
				
				case 3:
						m.sumOfLowerDiagonal();
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