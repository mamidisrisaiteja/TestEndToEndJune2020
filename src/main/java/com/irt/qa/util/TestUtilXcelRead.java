package com.irt.qa.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtilXcelRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
		File fi=new File("C:/Users/saitejamamidi/eclipse-workspace/IRT_POM_ENDTOEND_22Jun2020/src/main/java/com/irt/qa/testdata/ApplicationList.xlsx");
	FileInputStream fip=new FileInputStream(fi);
	XSSFWorkbook xwb=new XSSFWorkbook(fip);
	XSSFSheet xs=xwb.getSheetAt(0);
	
	}
 
 catch (Exception e) {
	 System.out.println(e.getMessage());
	 
 }
	}
	
} 

