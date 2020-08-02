package arithmeticNew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileprog2 {

	public static void main(String[] args) throws IOException { 
		File f = new File("C:\\Users\\Windows 10\\Desktop\\file.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		File f1 = new File("C:\\Users\\Windows 10\\Desktop\\file2.txt");
		FileWriter wr =new FileWriter(f1);
		BufferedWriter br1=new BufferedWriter(wr);
		String s;
		while((s=br.readLine())!=null)
		
		{
			br1.write(s);
			br1.newLine();
			System.out.println(s);
		}
		    br1.close();
		
	}
	}
