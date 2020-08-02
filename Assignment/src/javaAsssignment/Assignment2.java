package javaAsssignment;

public class Assignment2 {
	
	public int sum(int a,int b)
	{
		int c =a +b;
		System.out.println("Sum total is "+ c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c =a - b;
		System.out.println("Sub total is "+ c);
		return c;
	}
	
	public int div(int a,int b)
	{
		int c =a/b;
		System.out.println("Div total is "+ c);
		return c;
	}
	
	public void mul(int a,int b)
	{
		int c =a*b;
		System.out.println("Mul total is "+ c);
		 
	}

	public static void main(String[] args) {
	Assignment2 obj =new Assignment2();
	int SumResult=obj.sum(10,2);
	int SumResult1=obj.sum(SumResult, 2);
	int SubResult =obj.sub(SumResult1, 2);
	int DivResult =obj.div(2, 2);
	obj.mul(SubResult,DivResult );

	}

}
