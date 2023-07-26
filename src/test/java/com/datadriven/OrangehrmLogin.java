package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class OrangehrmLogin {

	public static void main(String[] args) throws IOException {
		File file =    new File("E:\\login.xlsx");
		FileInputStream fs = new FileInputStream(file);
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		 
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		for(int r=0;r<rows;r++)
		{
			
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.getCell(c);
				System.out.println(cell.toString());
			}
		}
	}

}
