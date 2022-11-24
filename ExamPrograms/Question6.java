import java.io.*;
import java.util.*;
class Cities
{
	Cities()
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter number of Cities to enter : ");
		n=sc.nextInt();
		
		String city[]=new String[n];
		String temp="";
		
		System.out.print("Enter Name of Cities : ");
		for(int i=0;i<n;i++)
		{
			System.out.println("City["+i+"]=");
			city[i]=sc.next()+sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(city[i].compareTo(city[j])>0)
				{
					temp=city[i];
					city[i]=city[j];
					city[j]=temp;
				}
			}
		}
		System.out.println("Sorted Cities are :");
		for(int i=0;i<n;i++)
		{
			System.out.println("City["+i+"]="+city[i]);
		}
	}
}

public class Question6
{
	public static void main(String[] arg) 
	{
		Cities c=new Cities();
	}
}