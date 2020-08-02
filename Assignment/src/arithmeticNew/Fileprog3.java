package arithmeticNew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileprog3 {

		public void readdata(int first, int last) throws IOException
		{
			
			 File f = new File("C:\\Users\\Windows 10\\Desktop\\file.txt");
			 FileReader fr =new FileReader(f);
			 BufferedReader br=new BufferedReader(fr);
			 int i=0;
			 String s;
			 while((s=br.readLine())!=null)
			 {
				i=i+1;
				if(i>=first && i<=last)
				{
					
					System.out.println(s);
			 }
			}
		}
	 
		 public static void main(String[] args) throws IOException { 
			 
			 Fileprog3 obj1=new Fileprog3();
			 obj1.readdata(1,2);
		 }
			}
					