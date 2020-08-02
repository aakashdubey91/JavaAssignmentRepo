package arithmeticNew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Windows 10\\Desktop\\file1.txt");
		FileWriter wr =new FileWriter(f,true);
		BufferedWriter br=new BufferedWriter(wr);
		br.newLine(); 
		br.write("This is third file");
		br.newLine();
		br.write("This is fourth line");
		br.close();
	}

}
