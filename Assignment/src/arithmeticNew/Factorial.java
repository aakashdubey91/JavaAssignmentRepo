package arithmeticNew;

import java.util.Scanner;

public class Factorial {


	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter value of i");
		int i =S.nextInt();
		int j,n=1;
		for (j=1;j<=i;j++) {
			n=j*n;
			
        }
		System.out.println("factorial of the number is " +n);
        }
	}
	



