import java.io.*;
import java.sql.*;
//import java.sql.ResultSet.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
class TableOperations
{
	Connection c=null;
	Statement st=null;
	ResultSet rs=null;
	ResultSet rs2=null;
	Scanner sc=new Scanner(System.in);
	
	Object[] data=new Object[3];
	int roll;
	String name;
	float per;
	
	TableOperations()
	{
		try
		{
			c=DriverManager.getConnection("jdbc:postgresql://localhost/demoJDBC","postgres","kolte123");
			st=c.createStatement();
			st.executeUpdate("create table student(roll_no int Primary key,name varchar(50),percent Float)");
			System.out.println("Table Create Sucessfully...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void tabledata(ResultSet rs)
	{
		try{
			
		DefaultTableModel dtm=null;
		dtm=new DefaultTableModel();
		JTable table=new JTable(dtm);
		JScrollPane panel=new JScrollPane(table);
		JFrame f=new JFrame("Question2");
		String columns[]={"Roll_no","Student Name","Percentage"};
		for(int i=0;i<3;i++)
		{
			dtm.addColumn(columns[i]);
		}
		while(rs.next())
		{
			for(int i=0;i<3;i++)
			{
				data[i]=rs.getObject(i+1);
			}
			dtm.addRow(data);
		}
		
		panel.setBounds(10,10,400,400);
		f.add(panel);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public void insert()
	{
		try
		{	
		System.out.print("Enter Roll_No. : ");
		roll=sc.nextInt();
		
		rs=st.executeQuery("select * from student where roll_no="+roll);
		if(rs.next())
		{
			System.out.println("Roll Number already exist as shown on Frame : \n ");
			System.out.printf("%20s %20s %20s\n","Roll No.","Student Name","Percentage");
			System.out.printf("%20s %20s %20s\n",rs.getObject(1),rs.getObject(2),rs.getObject(3));
		}
		else
		{
			System.out.print("Enter Name : ");
			name=sc.next()+sc.nextLine();
			System.out.print("Enter Percentage : ");
			per=sc.nextFloat();
			st.executeUpdate("insert into student(roll_no,name,percent) values("+roll+",'"+name+"',"+per+")");
			System.out.println("Record Inserted Sucessfully.");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void modify()
	{
		try
		{	
			System.out.print("Enter Roll_No. of Record which you want to modify : ");
			roll=sc.nextInt();
			
			rs=st.executeQuery("select * from student where roll_no="+roll);
			if(rs.next())
			{
				System.out.println("The Record you want to modify is  : \n ");
				System.out.printf("%20s %20s %20s\n","Roll_No","Name","Persentage");
				System.out.printf("%20s %20s %20s\n",rs.getObject(1),rs.getObject(2),rs.getObject(3));
				System.out.print("Enter new Name to change : ");
				name=sc.next()+sc.nextLine();
				System.out.print("Enter new Percentage to change : ");
				per=sc.nextFloat();
				st.executeUpdate("update student set name='"+name+"',percent="+per+" where roll_no="+roll);
				System.out.println("Record Modified Sucessfully.");
			}
			else
			{
			System.out.println("No Such Record Found.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void delete()
	{
		try{
		System.out.print("Enter Roll_No. of Record which you want to Delete : ");
			roll=sc.nextInt();
			
			rs=st.executeQuery("select * from student where roll_no="+roll);
			if(rs.next())
			{
				st.executeUpdate("delete from student where roll_no="+roll);
				System.out.println("Record Deleted Sucessfully.");
			}
			else{
				System.out.println("No Such Record Found.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public void search()
	{
		try{
		System.out.print("Enter Roll_No. of Record which you want to Display : ");
			roll=sc.nextInt();
			
			rs=st.executeQuery("select * from student where roll_no="+roll);
			rs2=rs;
			if(rs.next())
			{
				//rs.previous();
				tabledata(rs2);
			}
			else{
				System.out.println("No Such Record Found.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void viewAll()
	{
		try
		{
			rs=null;
			rs=st.executeQuery("select * from student");
			rs2=rs;
			if(rs.isBeforeFirst())
			{
				//rs.previous();
				tabledata(rs2);
			}
			else
			{
				System.out.println("No Record Found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Question2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			TableOperations to=new TableOperations();
			while(true)
			{
				System.out.print("\n\n1.insert\n2.Modify\n3.Delete\n4.Search\n5.ViewAll\n6.Exit.\n\t\tEnter Your Choise :");
				int n=sc.nextInt();
				switch(n)
				{
					case 1:
							to.insert();
					break;
					
					case 2:
							to.modify();
					break;
					
					case 3:
							to.delete();
					break;
					
					case 4:
							to.search();
					break;
					
					case 5:
							to.viewAll();
					break;
					
					case 6:
							System.exit(0);
					break;
					
					default: System.out.println("Invalid Input....");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}