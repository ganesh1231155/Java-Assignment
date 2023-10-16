import java.util.*;
public class Question1{
	public static void main(String sk[]){
		System.out.print("Enter Number to check prime or not : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1){
			System.out.println(n+" is not a prime number.");
		}
		else{
			for(int i=2;i<n;i++){
				if(n%i==0)
				{
					System.out.println(n+" is not a prime number.");
					return;
				}
			}
			System.out.println(n+" is a prime number.");
		}
	}
}