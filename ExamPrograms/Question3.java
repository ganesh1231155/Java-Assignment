import java.io.*;
import java.util.*;
public class Question3
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print("how many Number of Elements to enter :");
		int n=sc.nextInt();
		int[] array=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("array["+i+"]=");
			array[i]=sc.nextInt();
		}
		
		System.out.print("Enter Number to search :");
		int a=sc.nextInt();
		x=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==a)
			{
				System.out.println("Entered Number "+a+" is present at index "+i+" , Position "+(i+1));
				x++;
			}
		}
		if(x==0)
		{
			System.out.println("Entered Number "+a+" is not present in Array.");
		}
	}
}
