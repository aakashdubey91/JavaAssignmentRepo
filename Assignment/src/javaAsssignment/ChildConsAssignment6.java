package javaAsssignment;

public class ChildConsAssignment6 extends ParentConsAssignment6{
	
	
	public ChildConsAssignment6()
	{
     super(1,1);
	System.out.println("This is Default Child Constructor");	
		
	}
	
	public ChildConsAssignment6(int a)
	{
		this(1,1,1);
	System.out.println("This is One Parametrized Child Constructor");	
		
	}
	
	public ChildConsAssignment6(int a ,int b)
	{
	this(1);
	System.out.println("This is Two Parametrized Child Constructor");	
		
	}
	
	public ChildConsAssignment6(int a, int b, int c)
	{
	this(12,12,12,12);
	System.out.println("This is Three Parametrized Child Constructor");	
		
	}
	
	public ChildConsAssignment6(int a, int b, int c ,int d)
	{
	this();
	System.out.println("This is Four Parametrized Child Constructor");	
		
	}

	
	  public static void main(String[] args)   
    {
		  ChildConsAssignment6 obj = new ChildConsAssignment6(12,12);
		  
		  
		  
	}

}
