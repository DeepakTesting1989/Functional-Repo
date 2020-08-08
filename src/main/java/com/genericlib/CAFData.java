package com.genericlib;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CAFData {


	public Object[][] gettingCAFdata(String BASICINFO) throws Exception
	{
	FileInputStream fis= new FileInputStream("F:\\CSM_Project\\New folder\\CAF.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	int sheets=workbook.getNumberOfSheets();
	XSSFSheet sh= workbook.getSheet("BASICINFO");
	System.out.println("number of sheet:"+sheets);
	Object[][] data= new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	for(int i=0; i<sh.getLastRowNum();i++)
	{
		for(int k=0;k<sh.getRow(0).getLastCellNum();k++)
		{
			data[i][k]=sh.getRow(i+1).getCell(k).toString();
		}
	}
	return data;
	}
	
	public Object[][] gettingValidationdata(String JuniorCAF) throws Exception
	{
	FileInputStream fis= new FileInputStream("F:\\CSM_Project\\New folder\\New folder\\JuniorFieldValidationData2.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	int sheets=workbook.getNumberOfSheets();
	XSSFSheet sh= workbook.getSheet("JuniorCAF");
	System.out.println("number of sheet:"+sheets);
	Object[][] data= new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	for(int i=0; i<sh.getLastRowNum();i++)
	{
		for(int k=0;k<sh.getRow(0).getLastCellNum();k++)
		{
			data[i][k]=sh.getRow(i+1).getCell(k).toString();
		}
	}
	return data;
	}
}
