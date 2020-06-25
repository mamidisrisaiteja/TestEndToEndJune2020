package com.irt.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase()  {
		try {
		prop =new Properties();
		FileInputStream fip=new FileInputStream("C:/Users/saitejamamidi/eclipse-workspace/IRT_POM_ENDTOEND_22Jun2020/src/main/java/com/irt/qa/config/config.properties");
	    prop.load(fip);
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public static void initialization() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Automation\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get(prop.getProperty("url"));	
	}

}
