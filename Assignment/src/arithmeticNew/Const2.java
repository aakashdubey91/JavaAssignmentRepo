package arithmeticNew;

public class Const2 extends Cons1 {
	
	
	
	public void Method5(){
		this.Method7(1,1);
		System.out.println("Child Default Method");
		
	  }
	
      public void Method6(int a)
      {
    
    	this.Method8(1,1,1);
		System.out.println("Child 1 Parametrized Method ");
		
	  }

      
      public void Method7(int a, int b){
    	  
    	super.Method3(1,1); 
  		System.out.println("Child 2 Parametrized Method ");
  		
  	  }
      
      public void Method8(int a, int b,int c){
    	  
    	 this.Method5();
    	System.out.println("Child 3 Parameterized Method ");
    		
      }
      
     public static void main(String[] args) {
		
    	 Const2 obj1= new Const2();
    	 obj1.Method6(1);
    	 
    	 
	}
}
