package arithmeticNew;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

         public class Fileexcel5
         {

		   public static void main(String[] args) throws IOException, BiffException 
		   { 
		 	 
			File f =new File("E:\\Selenium Stuff\\Testing.xls");
			Workbook wk=Workbook.getWorkbook(f);
			Sheet ws=wk.getSheet(0);
			int r=ws.getRows();
			int c=ws.getColumns();	
		    for (int i=0;i<=r;i++)
		    {
		    	for (int j=0;j<=c;j++)
		    	{
		    		
		    		Cell c1=ws.getCell(j, i);
		    		System.out.println(c1.getContents());
		    	}
		    	
		    }
		    
		    File f1=new File("E:\\Selenium Stuff\\Testing1.xls");
		    WritableWorkbook wk1=Workbook.createWorkbook(f1);
//		    WritableSheet ws1=wk1.createSheet(aakash, 1);
		    
		
            }
          }
					