package javaAsssignment;

public class ChildMethodAssignment7 extends ParentMethodAssignment7{
	
	
	public void ChildMethodAssignment7()
	{
    super.ParentMethodAssignment7(1, 2, 3, 4);
	System.out.println("This is Default Child Method");	
		
	}
	
	public void ChildMethodAssignment7(int a)
	{
	this.ChildMethodAssignment7();
	System.out.println("This is One Parametrized Child Method");	
		
	}
	
	public void ChildMethodAssignment7(int a ,int b)
	{
	this.ChildMethodAssignment7(1);
	System.out.println("This is Two Parametrized Child Method");	
		
	}
	
	public void ChildMethodAssignment7(int a, int b, int c)
	{
	this.ChildMethodAssignment7(1,1,1,1);
	System.out.println("This is Three Parametrized Child Method");	
		
	}
	
	public void ChildMethodAssignment7(int a, int b, int c ,int d)
	{
	this.ChildMethodAssignment7(1,1);
	
	System.out.println("This is Four Parametrized Child Method");	
		
	}

	
	  public static void main(String[] args)   
    {
		  ChildMethodAssignment7 obj = new ChildMethodAssignment7();
		  obj.ChildMethodAssignment7(1,1,1);
		  
		  
		  
	}

}
