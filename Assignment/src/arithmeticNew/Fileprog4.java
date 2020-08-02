package arithmeticNew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileprog4 {

		public void writedata() throws IOException
		{
			 Scanner s=new Scanner(System.in);
			 File f = new File("C:\\Users\\Windows 10\\Desktop\\file3.txt");
			 FileWriter fr =new FileWriter(f);
			 BufferedWriter br=new BufferedWriter(fr);
			 for(int i=0;i<=8;i++){
				 
				 String s1=s.next();
				 br.write(s1);
				 System.out.println(s1);
				 br.newLine();                
				 
			 }
			      br.close();

		}
		 public static void main(String[] args) throws IOException { 
			 
			 Fileprog4 obj1=new Fileprog4();
			 obj1.writedata();
		 }
			}
					