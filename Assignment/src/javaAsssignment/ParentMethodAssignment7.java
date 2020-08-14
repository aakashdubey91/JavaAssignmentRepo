package javaAsssignment;

public class ParentMethodAssignment7 {
	
	
	public void ParentMethodAssignment7()
	{
	this.ParentMethodAssignment7(12);
	System.out.println("This is Default Parent Method");	
		
	}
	
	public void ParentMethodAssignment7(int a)
	{

	System.out.println("This is One Parametrized parent Method");	
		
	}
	
	public void ParentMethodAssignment7(int a ,int b)
	{
     this.ParentMethodAssignment7();
	System.out.println("This is Two Parametrized Parent Method");	
		
	}
	
	public void ParentMethodAssignment7(int a, int b, int c)

	{
	this.ParentMethodAssignment7(1, 3);
	System.out.println("This is Three Parametrized Parent Method");	
		
	}
	
	public void ParentMethodAssignment7(int a, int b, int c ,int d)
	{
	this.ParentMethodAssignment7(1, 2, 3);
	System.out.println("This is Four Parametrized Parent Method");	
		
	}


}
