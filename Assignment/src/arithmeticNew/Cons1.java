package arithmeticNew;

public class Cons1 {
	
	
	
	public void Method1(){
		this.Method2(1);
		System.out.println("Parent Default Method");
		
	}
	
      public void Method2(int a){
    	
		System.out.println("Parent 1 Parametrized Method ");
		
	}

      
      public void Method3(int a, int b){
    	
    	this.Method4(1, 1,1); 
  		
  		System.out.println("Parent 2 Parametrized Method ");
  		
  	}
      
      public void Method4(int a, int b,int c){
      
    	  this.Method1();    	
    	  System.out.println("Parent 3 Parametrized Method ");
    		
    }
     
}
