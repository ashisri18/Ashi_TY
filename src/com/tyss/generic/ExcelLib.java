package com.tyss.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
String filePath ="D:\\MyProject\\crm\\BuildShop\\src\\test\\resources\\testdata\\testData.xlsx";
	
	public String getExcelData(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		String data =WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	}
	
	public void setExcelData(String sheetName,int rowNum,int colNum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Row row =wb.getSheet(sheetName).getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		FileOutputStream fos = new FileOutputStream(filePath);
		cel.setCellValue(data);
		wb.write(fos);
		wb.close();
	}

}
