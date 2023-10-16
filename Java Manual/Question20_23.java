import java.util.*;

class person{
	String name,gender;
	int age;
	person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
}

class student extends person{
	student(String name,int age,String gender){
		super(name,age,gender);
	}
	void display(){
		System.out.println("\nTeacher\nName :"+super.getName()+"\nAge :"+super.getAge()+"\nGender :"+super.getGender());
	}
}
class teacher extends person{
	String subject;
	float salary;
	teacher(String name,int age,String gender,String subject,float salary){
		super(name,age,gender);
		this.subject=subject;
		this.salary=salary;
	}
	void display(){
		System.out.println("\nTeacher\nName :"+super.getName()+"\nAge :"+super.getAge()+"\nGender :"+super.getGender()+"\nSubject :"+subject+"\nSalary : "+salary);
	}
}


public class Question20_23{
	public static void main(String sk[]){
		teacher t1=new teacher("ABC",43,"Male","DSA",100000);
		teacher t2=new teacher("xyz",38,"Female","Java",150000);
		student s1=new student("qwerty",21,"Female");
		student s2=new student("asdfg",22,"Male");
		t1.display();
		t2.display();
		s1.display();
		s2.display();
	}
}