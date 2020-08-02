package javaAsssignment;

public class Assignment5 {
	
	public void Assignment5()
	{
		this.Assignment5(1, 1, 1);
		System.out.println("This is default method");
	}
	
	public void Assignment5(int a)
	{
		this.Assignment5();
		System.out.println("This is one parametrised Method");
	}
	
	
	public void Assignment5(int a ,int b)
	{
		this.Assignment5(10);
		System.out.println("This is two parametrised Method");
	}
	
	public void Assignment5(int a, int b, int c)
	{
		System.out.println("This is three parametrised Method");
	}
	
	public void  Assignment5(int a, int b, int c ,int d)
	{
		this.Assignment5(12, 12);
		System.out.println("This is four parametrised Method");
	}
	
	
	public static void main(String[] args) 
	{
		Assignment5 obj=new Assignment5();
		obj.Assignment5(12, 12,12, 12);
		
	}
}
