import java.util.*;

class parentClass{
	
	parentClass(){
		System.out.println("commen  Parent Class.");
	}
}

class subClass1 extends parentClass{
	subClass1(){
		System.out.println("1st Parent Class.");
	}
}
class subClass2 extends parentClass{
	subClass2(){
		System.out.println("2nd subclass Class.");
	}
}

public class Question12{
	public static void main(String sk[]){
		subClass1 s1=new subClass1();
		subClass2 s2=new subClass2();
		
	}
}