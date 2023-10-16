import java.util.*;

class bank{
	public static int Account_count=1;
	int Account_No;
	String name;
	String type;
	float balance;
	Scanner sc=new Scanner(System.in);
	bank(String name,String type,Float amount){
		this.name=name;
		this.type=type;
		this.balance=amount;
		Account_No=Account_count;
		Account_count++;
	}
	public void deposit(){
		System.out.print("Enter Amount to deposit : ");
		float amt=sc.nextFloat();
		if(amt>200){
			balance+=amt;
			System.out.print("Amount deposited sucessfully.");
		}
		else{
			System.out.print("In sufficient amount to deposit.(minimum amount  : 200)");
		}
	}
	public void withdraw(){
		System.out.print("Enter Amount to withdraw : ");
		float amt=sc.nextFloat();
		if(amt>200&&balance>amt){
			balance-=amt;
			System.out.print("Amount withdrawled sucessfully.");
		}
		else{
			System.out.print("In sufficient amount to withdraw.");
		}
	}
	public void display(){
		System.out.println("\n\nAccount No. : "+Account_No+"\n Account Holder : "+name+"\nAccount balance :"+balance);
	}
}

public class Question8{
	public static void main(String sk[]){
		Scanner sc=new Scanner(System.in);
		bank[] b=new bank[100];
		int count=1;
		
		while(true){
			
			System.out.print("\nMenu : \n1.Create Account\n2.Deposit\n3.Withdraw\n4.display details\n5.Exit\nEnter Your Choise :");
			int c=sc.nextInt();
			int no;
			switch(c){
					case 1: 
							System.out.print("Enter Name of Account holder : ");
							String name=sc.nextLine();
							sc.next();
							System.out.print("Enter Account type : ");
							String type=sc.nextLine();
							sc.next();
							System.out.print("Enter Minimum balance : ");
							float balance=sc.nextFloat();						
							b[count]=new bank(name,type,balance);
							count++;
					break;
					case 2:
							System.out.print("Enter Account number : ");
							no=sc.nextInt();
							b[no].deposit();
					break;
					case 3:
							System.out.print("Enter Account number : ");
							no=sc.nextInt();
							b[no].withdraw();
					break;
					case 4 :
							System.out.print("Enter Account number : ");
							no=sc.nextInt();
							b[no].display();
					break;
					case 5: return;
					
					default: System.out.println("Invalid Input.");
					
							
			}
		}
	}
}