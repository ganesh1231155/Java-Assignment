public class Question6{
public static void main(String sk[]){
	String[] students = new String[10];
	String studentName = "Peter Smith";
	students[0] = studentName;
	studentName = null;
}
}

//students has reference to string array[] no garbage

//array has reference to studentName("Peter Smith") no garbage

//if studentName become null but students still refer to it  no garbage
