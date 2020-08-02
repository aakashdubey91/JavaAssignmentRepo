package arithmeticNew;

import java.util.Scanner;

public class Swapping {


	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=S.nextInt();
		System.out.println("Enter value of b");
		int b=S.nextInt();
		System.out.println("value of a and b before swapping is");
		System.out.println(a);
		System.out.println(b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a and b after swapping is");
		System.out.println(a);
		System.out.println(b);
		
        }
	}
	


