package arithmeticNew;


public class Pattern5 {

    
	public static void main(String[] args) {
		int i,j,k;
		int r=5;
		for(i=1;i<=r;i++) {
			
			for(j=1;j<=r-i;j++) {
					
		      System.out.print(" ");
			}
			
			for(k=1;k<=2*i-1;k++){
		        System.out.println("*");
			}
		
		}
}}