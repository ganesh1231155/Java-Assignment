import java.io.*;
import java.util.*;

class employee
{
	int id;
	String name,deptname;
	float salary;
	static int count=0;
	employee()
	{
		this.id=0;
		this.name="Undefine";
		this.deptname="Undefine";
		this.salary=10000f;
		count++;
	}
	
	employee(int id,String name,String deptname,float salary)
	{
		this.id=id;
		this.name=name;
		this.deptname=deptname;
		this.salary=salary;
		count++;
	}
	
	public void display()
	{
		System.out.printf(" %10s %20s %20s %10s ",id,name,deptname,salary);
	}
	public void displayCount()
	{
		System.out.println("Total number of objects created are : "+count);
	}
}
public class Question9
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		employee e[]=new employee[1000];
		while(true)
		{
			System.out.print("\n\n1.Create Employee object.\n2.Display All Employee details.\n3.Display number of objects created.\n4.Exit\nEnter Your Choice :");
			int n=sc.nextInt();
			int i=0,id;
			String name,deptname;
			float salary;
			switch(n)
			{
				case 1:
						System.out.print("Enter id of Employee :");
						id=sc.nextInt();
						System.out.print("Enter Name of Employee :");
						name=sc.next()+sc.nextLine();
						System.out.print("Enter Department Name of Employee :");
						deptname=sc.next()+sc.nextLine();
						System.out.print("Enter Salary of Employee :");
						salary=sc.nextFloat();
						e[i++]=new employee(id,name,deptname,salary);
				break;
				
				case 2:
						System.out.printf(" %10s %20s %20s %10s ","id","name","deptname","salary");
						for(int j=0;j<i;j++)
						{
							e[j].display();
						}
				break;
				
				case 3:
						e[0].displayCount();
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