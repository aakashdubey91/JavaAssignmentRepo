package arithmeticNew;

import java.util.Scanner;

public class Table {


	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n,table;
		System.out.println("Enter value of i");
		int i=S.nextInt();
        for (n=1;n<=10;n++) {
        	table=i*n;
        	System.out.println(table);
        	
        }
	}
	
	

}


