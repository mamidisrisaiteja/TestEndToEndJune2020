package com.irt.qa.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static Object[][] data;
	
	public static Object[][] getTestData(String sheetName){
	try {
	File fi=new File("C:/Users/saitejamamidi/eclipse-workspace/IRT_POM_ENDTOEND_22Jun2020/src/main/java/com/irt/qa/testdata/ApplicationList.xlsx");
FileInputStream fip=new FileInputStream(fi);
 book=new XSSFWorkbook(fip);
 sheet=book.getSheetAt(0);
	data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
for(int i=0;i<=sheet.getLastRowNum();i++) {

	for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
		data[i][j]=sheet.getRow(i+1).getCell(j).toString();
	}
}

}

catch (Exception e) {
 System.out.println(e.getMessage());
 
}
	
	return data;
	}
}
