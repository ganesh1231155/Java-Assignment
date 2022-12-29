import java.io.*;
import java.sql.*;
public class Question1
{
	public static void main(String arg[])
	{
		try
		{
		Connection c=null;
		c=DriverManager.getConnection("jdbc:postgresql://localhost/demoJDBC","postgres","kolte123");
		Statement st=null;
		st=c.createStatement();
		System.out.println("Database Connection Sucessful....");
		ResultSet rs=st.executeQuery("select * from student");
		ResultSetMetaData rsmd=rs.getMetaData();
		
		int column_count=rsmd.getColumnCount();
		System.out.println(column_count);
		System.out.printf("%20s %20s\n","Column Name","Data Type");
		for(int i=0;i<column_count;i++)
		{
			System.out.printf("%20s %20s\n",rsmd.getColumnName(i+1),rsmd.getColumnTypeName(i+1));
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}