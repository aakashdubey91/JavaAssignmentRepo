package arithmeticNew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileprog1 {

		public void readdata(int line) throws IOException
		{
			
			 File f = new File("C:\\Users\\Windows 10\\Desktop\\file.txt");
			 FileReader fr =new FileReader(f);
			 BufferedReader br=new BufferedReader(fr);
			 int i=0;
			 String s;
			 while((s=br.readLine())!=null)
			 {
				i=i+1;
				if(i==line)
				{
					
					System.out.println(s);
			 }
			}
		}
	 
		 public static void main(String[] args) throws IOException { 
			 
			 Fileprog1 obj1=new Fileprog1();
			 obj1.readdata(4);
		 }
			}
					