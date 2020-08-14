package javaAsssignment;

public class ParentConsAssignment6 {
	
	
	public ParentConsAssignment6()
	{
	this(12,12,12);
	System.out.println("This is Default Parent Constructor");	
		
	}
	
	public ParentConsAssignment6(int a)
	{
	this(12,12,12,12);
	System.out.println("This is One Parametrized parent Constructor");	
		
	}
	
	public ParentConsAssignment6(int a ,int b)
	{
     this(12);
	System.out.println("This is Two Parametrized Parent Constructor");	
		
	}
	
	public ParentConsAssignment6(int a, int b, int c)
	{
	System.out.println("This is Three Parametrized Parent Constructor");	
		
	}
	
	public ParentConsAssignment6(int a, int b, int c ,int d)
	{
	this();
	System.out.println("This is Four Parametrized Parent Constructor");	
		
	}


}
