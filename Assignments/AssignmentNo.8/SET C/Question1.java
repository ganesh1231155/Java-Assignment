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
			
			Object[] data=new Object[3];
			
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