import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.text.SimpleDateFormat;

public class Question1
{
	public static void main(String[] a)
	{
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
		SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyy"); 
		SimpleDateFormat formatter3 = new SimpleDateFormat("EEEE MMMM dd yyyy");  
		SimpleDateFormat formatter4 = new SimpleDateFormat("dd/mm/yyyy HH.mm.ss aa");  
		SimpleDateFormat formatter5 = new SimpleDateFormat("HH.mm.ss");  
		
		Date date=new Date();
		
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		
		System.out.println("Current date : "+formatter1.format(date));
		System.out.println("Current date : "+formatter2.format(date));
		System.out.println("Current date and time : "+formatter3.format(date));
		System.out.println("Current date and time : "+date);
		System.out.println("Current time : "+formatter4.format(date));
		System.out.println("Current time"+formatter5.format(date));
		
		System.out.println("WEEK_OF_YEAR : "+c.get(c.WEEK_OF_YEAR));		
		System.out.println("WEEK_OF_MONTH : "+c.get(c.WEEK_OF_MONTH));		
		System.out.println("DAY_OF_YEAR : "+c.get(c.DAY_OF_YEAR));		
		

	}
	
}