package com.ManageExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ManageExcel {
	
	public XSSFWorkbook workbook;
	
	public XSSFSheet sheet;
	
	
	public int tcfoundrow=0;
	
	
	public ManageExcel() throws IOException
		
	{
		
		File f=new File(System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		workbook=new XSSFWorkbook(fis);
		
		
	}
	
	
	
	public int getTestcaseRow(String testcase,int itr,String shtnmae)
	{
		
				
		int rcnt=workbook.getSheet(shtnmae).getLastRowNum();
		
		for(int r=1;r<=rcnt;r++)
		{
				
			String tcname=workbook.getSheet(shtnmae).getRow(r).getCell(0).getStringCellValue();
			int iteration=(int) workbook.getSheet(shtnmae).getRow(r).getCell(1).getNumericCellValue();
			
			
			if(tcname.equals(testcase) && iteration==itr)
			{
				
				tcfoundrow=r;
				break;
				
			}
			
		}
		
			return tcfoundrow;
		
	}
	
	
	
	
	
	
	
	

}
