package arithmeticNew;

public class ChildC2 extends ParentC1 {
	
	
	
	public ChildC2(){
		this(1,2);
		System.out.println("Child Default Constructor");
		
	  }
	
      public ChildC2(int a)
      {
        this(12,12,12);
		System.out.println("Child 1 Parametrized Constructor ");
		
	  }

      
      public ChildC2(int a, int b){
    	  
    	super(12,12);
  		System.out.println("Child 2 Parametrized Constructor ");
  		
  	  }
      
      public ChildC2(int a, int b,int c){
    	  
    	this();
    	System.out.println("Child 3 Parameterized Constructor ");
    		
      }
      
     public static void main(String[] args) {
		
    	 ChildC2 obj1= new ChildC2(12);
    	
    	 
	}
}
