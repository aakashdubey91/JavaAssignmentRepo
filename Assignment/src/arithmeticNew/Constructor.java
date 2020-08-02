package arithmeticNew;

public class Constructor {

	public Constructor() 
	{
	this(12,23,23);
			
	System.out.println("default constructor");
	}
	
    public Constructor(int a) 
    {
    this();
    System.out.println("1 parameter constructor");
	}
	
    public Constructor(int a, int b) 
    {
	this(8);
	
	System.out.println("2 parametrized constructor");
    }
   
    public Constructor(int a, int b, int c) 
    {

	System.out.println("3 parametrized constructor");
    }
	
	
	public static void main(String[] args) {
		Constructor obj1=new Constructor(12,10);
		
		
	}

}
