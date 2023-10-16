import java.util.*;
import java.lang.String;

class string{
Scanner sc=new Scanner(System.in);
	String reverseit(String str){
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s+=str.charAt(i);
		}
		return s;
	}
	boolean isequal(String str1,String str2){
		return str1.equals(str2);
	}
	void changeCase(String str)
	{
		System.out.println("\n1.TO UpperCase\n 2.TO LowerCase\nEnter Choise : ");
		int n=sc.nextInt();
		switch(n){
			case 1:
					System.out.println("String in UpperCase : "+str.toUpperCase());
			break;
			case 2:
					System.out.println("String in LowerCase : "+str.toLowerCase());			
			break;
			default : System.out.println("Invalid Input.");
		}
	}
}

public class Question14{
	public static void main(String sk[]){
		String str1="Kolte";
		String str2="Shreeganesh";
		string s=new string();
		System.out.println("Are String equal or not :"+s.isequal(str1,str2));
		System.out.println("Reversed Strign str1 : "+s.reverseit(str1));
		System.out.println("Reversed Strign str2 : "+s.reverseit(str2));
		s.changeCase(str1);
		s.changeCase(str1);
	}
}
