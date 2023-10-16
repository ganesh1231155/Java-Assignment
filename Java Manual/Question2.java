import java.util.*;
public class Question2{
	public static void main(String sk[])
	{
		System.out.print("Enter a number to find it's factorial : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		if(n<0){
			System.out.println("Factorial of negative number is undefined.");
			return;
		}
		if(n==0){
			System.out.println("Factorial of Zero(0) is zero(0).");
		}
		for(int i=2;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
	}
}