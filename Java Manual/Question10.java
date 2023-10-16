import java.util.*;
public class Question10{
	public static void main(String sk[]){
		System.out.print("Enter Digit : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0;
		float fact=1;
		
		for(int i=1;i<=n;i++){
			fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;
			}
			System.out.print(" +1/"+i+"!");
			sum+=1/fact;
		}
		
		System.out.println("Out Put : "+sum);
	}
}