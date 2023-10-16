import java.util.*;

class person{
	Strign name,gender;
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

class student{
	student(String name,int age,String gender){
		super(name,age,gender);
	}
	void display(){
		System.out.println("\nTeacher\nName :"+super.getName+"\nAge :"+super.getAge()+"\nGender :"+super.getGender()+"\nSubject :"+subject+"\nSalary : "+salary);
	}
}
class teacher{
	String subject;
	float salary;
	teacher(String name,int age,String gender,String subject,float salary){
		super(name,age,gender);
		this.subject=subject;
		this.salary=salary;
	}
	void display(){
		System.out.println("\nTeacher\nName :"+super.getName+"\nAge :"+super.getAge()+"\nGender :"+super.getGender()+"\nSubject :"+subject+"\nSalary : "+salary);
	}
}


public class Question20_23{
	
}