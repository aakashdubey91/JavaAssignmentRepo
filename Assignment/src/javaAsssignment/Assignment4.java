package javaAsssignment;

public class Assignment4 {
	
	public  Assignment4()
	{
		this(12,12,12,12);
		System.out.println("This is one default Constructor");
	}
	
	public  Assignment4(int a)
	{
		this();
		System.out.println("This is one parametrised Constructor");
	}
	
	
	public  Assignment4(int a ,int b)
	{
		this(12);
		System.out.println("This is two parametrised Constructor");
	}
	
	public  Assignment4(int a, int b, int c)
	{
		this(12,12);
		System.out.println("This is three parametrised Constructor");
	}
	
	public  Assignment4(int a, int b, int c ,int d)
	{
		
		System.out.println("This is four parametrised Constructor");
	}
	
	
	public static void main(String[] args) 
	{
		Assignment4 obj=new Assignment4(12,12,12);
		
	}
}
