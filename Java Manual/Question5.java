import java.util.*;

class NumberHolder {
 public int anInt;
 public float aFloat;
}

public class Question5{
	public static void main(String sk[]){
		NumberHolder n=new NumberHolder();
		n.aFloat=12.1212f;
		n.anInt=12;
		System.out.println(n.aFloat);
		System.out.println(n.anInt);
	}
}

