import java.util.*;
public class Question3{
	public static void main(String sk[])
	{
		System.out.print("Enter a number to print Table : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%3d x%3d =%5d\n",n,i,n*i);
		}
	}
}