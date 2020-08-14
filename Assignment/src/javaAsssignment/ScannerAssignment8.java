package javaAsssignment;

import java.util.Scanner;

public class ScannerAssignment8 {
	
	public int sum(int x1,int x2)
	{
		int c =x1 +x2;
		System.out.println("Sum total is "+ c);
		return c;
	}
	
	public int sub(int x3,int x4)
	{
		int c =x3 - x4;
		System.out.println("Sub total is "+ c);
		return c;
	}
	
	public void div(int x5,int x6)
	{
		int c =x5/x6;
		System.out.println("Final Total  is" + c);
	}
	
	public int mul(int x7,int x8)
	{
		int c =x7*x8;
		System.out.println("Mul total is "+ c);
		return c;
		 
	}

	public static void main(String[] args) {
	ScannerAssignment8 obj =new ScannerAssignment8();
	System.out.println("Please enter valur of x1");
	Scanner s =new Scanner(System.in);
	int obj1 = s.nextInt();
	System.out.println("Please enter valur of x2");
	int obj2 = s.nextInt();
	int SumResult= obj.sum(obj1, obj2);
	System.out.println("Please enter value of a3");
	int obj3=s.nextInt();
	int sub=obj.sub(SumResult, obj3);
	System.out.println("Please enter value of a4");
	int obj4=s.nextInt();
	int mul=obj.mul(sub,obj4);
	System.out.println("Please enter value of a5");
	int obj5=s.nextInt();
    int sum1=obj.sum(mul, obj5);
    System.out.println("Please enter value of a6");
    int obj6=s.nextInt();
    obj.div(sum1, obj6);

	}

}
