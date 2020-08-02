package javaAsssignment;

public class Assignment3 {
	
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
	Assignment3 obj =new Assignment3();
	int SubResult=obj.sub(10,2);
	int SumResult=obj.sum(SubResult, 2);
	int SubResult1 =obj.sub(SumResult, 2);
	int DivResult =obj.div(2, 2);
	obj.mul(SubResult1,DivResult );

	}

}
