import java.util.*;
public class Question4{
	public static void main(String sk[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of digit of Fibonacci series to print : ");
		int n=sc.nextInt();
		if(n<1){
			System.out.println("Invalid Input.");
		}
		else{
			int a=1;
			int b=1;
			int c=0;
			if(n==1)
			{
				System.out.println("1.");
				return;
			}
			System.out.print("1 1 ");
			for(int i=0;i<n-2;i++)
			{
				System.out.print(a+b+" ");
				c=a+b;
				a=b;
				b=c;
			}
		}
	}
}