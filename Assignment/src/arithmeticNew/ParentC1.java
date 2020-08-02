package arithmeticNew;

public class ParentC1 {
	
	
	
	public ParentC1(){
		this(12,12,12);
		System.out.println("Parent Default Constructor");
		
	}
	
      public ParentC1(int a){
		this();
		System.out.println("Parent 1 Parametrized Constructor ");
		
	}

      
      public ParentC1(int a, int b){
  		this(12);
  		System.out.println("Parent 2 Parametrized Constructor ");
  		
  	}
      
      public ParentC1(int a, int b,int c){
    	  
    	System.out.println("Parent 3 Parametrized Constructor ");
    		
    	}
     
}
