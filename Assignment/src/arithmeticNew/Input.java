package arithmeticNew;

import java.util.Scanner;

public class Input {
	
	
	public int Sum(int a,int b) {
		
		int c;
		c=a+b;
		System.out.println("addition is"+ c);
		return c;
	
		
	}
	
	
   public int Sub(int a,int b) {
		
		int c;
		c=a-b;
		System.out.println("Subtraction is"+ c);
		return c;

		
	}
   
   public int mul(int a,int b) {
		
		int c;
		c=a*b;
		System.out.println("multiplication is"+ c);
		return c;
	
		
	}
   
   public void div(int a,int b) {
		
		int c;
		c=a/b;
		System.out.println("Final output is"+c);
	}

	public static void main(String[] args) {
		System.out.println("Please enter value of a1");
		Input obj=new Input();
		Scanner S=new Scanner(System.in);
		int obj1=S.nextInt();
		System.out.println("Please enter value of a2");
		int obj2=S.nextInt();
		int Sum=obj.Sum(obj1, obj2);
		System.out.println("Please enter value of a3");
		int obj3=S.nextInt();
		int sub=obj.Sub(Sum, obj3);
		System.out.println("Please enter value of a4");
		int obj4=S.nextInt();
		int mul=obj.mul(sub,obj4);
		System.out.println("Please enter value of a5");
		int obj5=S.nextInt();
	    int sum1=obj.Sum(mul, obj5);
	    System.out.println("Please enter value of a6");
	    int obj6=S.nextInt();
	    obj.div(sum1, obj6);
		
		
		
		
		
		
		
	}

}
