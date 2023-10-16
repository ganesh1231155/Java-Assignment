import java.util.*;

public class Question9{
	public static void main(String sk[]){
		float basic,hra,cca,pt,pf,da;
		Scanner sc=new Scanner(System.in);
		String name;
		int eno;
		System.out.print("Enter employee name : ");
		name=sc.nextLine();
		//sc.next();
		System.out.print("Enter employee number : ");
		eno=sc.nextInt();
		
		System.out.print("Enter basic salary : ");
		basic=sc.nextFloat();
		
		
		da=(basic*50)/100;
		hra=(basic*25)/100;
		pf=(basic*10)/100;
		pt=100.0f;
		cca=240.0f;
		float gross=basic+hra;
		float net=gross-pf-pt;
		
		System.out.print("Basic Salary : "+basic+"\nGross Salary : "+gross+"\nNet Salary : "+net);		
		}
}