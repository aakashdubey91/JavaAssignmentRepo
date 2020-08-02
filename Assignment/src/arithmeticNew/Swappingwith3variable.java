package arithmeticNew;

import java.util.Scanner;

public class Swappingwith3variable {


	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=S.nextInt();
		System.out.println("Enter value of b");
		int b=S.nextInt();
		System.out.println("value of a and b before swapping is");
		System.out.println(a);
		System.out.println(b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("value of a and b after swapping is");
		System.out.println(a);
		System.out.println(b);
		
        }
	}
	


