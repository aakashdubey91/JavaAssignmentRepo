package javaAsssignment;

public class Student {
	
	
	int rollno;
	int age;
	
	public void method1()
	{
	  System.out.println("Welcome All");
	}
	
	public void method2()
	{
	  System.out.println("Automation is Easy");
	}
	
	
	public static void main(String[] args) 
	{
		
		Student abc=new Student();
		abc.rollno = 12345;
		System.out.println("Roll no is "+ abc.rollno);
		abc.age = 28;
		System.out.println("Age is "+ abc.age);
		abc.method1();
		abc.method2();

	}

}
