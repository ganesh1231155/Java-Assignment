import java.sql.*;
import java.io.*;
public class Question2
{
	public static void main(String arg[])
	{
		try
		{
			Connection c=null;
			ResultSet rs=null;
			c=DriverManager.getConnection("jdbc:postgresql://localhost/demoJDBC","postgres","kolte123");
			DatabaseMetaData dbmd=c.getMetaData();
			System.out.println("Database Product Name : "+dbmd.getDatabaseProductName());
			System.out.println("User Name : "+dbmd.getUserName());
			System.out.println("Driver Name : "+dbmd.getDriverName());
			System.out.println("Driver Version : "+dbmd.getDriverVersion());
			
			
			rs=dbmd.getTables(null,null,null,new String[]{"TABLE"} );
			System.out.println("List of Tables : ");
			while(rs.next())
			{
				String table_n=rs.getString("TABLE_NAME");
				System.out.println("Table : "+table_n);
			}
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}