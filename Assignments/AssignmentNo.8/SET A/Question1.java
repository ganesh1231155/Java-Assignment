import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
public class Question1
{
	public static void main(String arg[])
	{
		try
		{
			Connection c=null;
			Statement st=null;
			ResultSet rs=null;
			Scanner sc=new Scanner(System.in);
			c=DriverManager.getConnection("jdbc:postgresql://localhost/demoJDBC","postgres","kolte123");
			st=c.createStatement();
			
			String cmd="create table student(roll_no int,name varchar(25),percent Float)";
			//st.executeUpdate(cmd);
			System.out.println("Table Created Sucessfully.");
			System.out.print("Enter Number of Records to enter in table. :");
			int n=sc.nextInt();
			int rno;
			String name;
			float per;
			Object[] data=new Object[3];
			
			for(int i=0;i<n;i++)
			{
				System.out.print("\n Enter Roll number : ");
				rno=sc.nextInt();
				System.out.print("\n Enter Name : ");
				name=sc.next()+sc.nextLine();
				System.out.print("\n Enter Percentage : ");
				per=sc.nextFloat();
				cmd="insert into student(roll_no,name,percent) values("+rno+",'"+name+"',"+per+")";
				//System.out.println(cmd);
				st.executeUpdate(cmd);
			}
			//DefaultTableModel dtm=new DefaultTableModel();
			DefaultTableModel dtm=new DefaultTableModel();
			JTable t=new JTable(dtm);
			String columns[]={"Roll Number","Student Name","Percentage"};
			for(int i=0;i<3;i++)
			{
				dtm.addColumn(columns[i]);	
			}
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				for(int i=0;i<3;i++)
				{
					data[i]=rs.getObject(i+1);
				}
				dtm.addRow(data);
			}
			
			
			JFrame f=new JFrame("Question3");
			
			JScrollPane p=new JScrollPane(t);
			p.setBounds(10,10,400,200);
			f.add(p);
			f.setLayout(null);
			f.setSize(500,500);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			st.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
		
	}
}