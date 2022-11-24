import java.io.*;
import java.util.*;

public class Question8
{
	public static void main(String[] arg)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=15;j++)
			{
				System.out.printf(" %3s ",i*j);
			}
			System.out.println();
		}
	}
}