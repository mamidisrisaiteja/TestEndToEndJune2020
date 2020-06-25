package com.irt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.irt.qa.base.TestBase;
import com.irt.qa.pages.ApplicationListPage;
import com.irt.qa.pages.HomePage;
import com.irt.qa.pages.LoginPage;
import com.irt.qa.util.TestUtil;

public class ApplicationListPageTest extends TestBase {
	
	public static LoginPage loginPage;
	public HomePage homePage;
	public ApplicationListPage applicationListPage;
	TestUtil testUtil;
	
	public ApplicationListPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		applicationListPage=loginPage.login(prop.getProperty("userId"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateApplicationListPageTitle() {
		Assert.assertEquals(applicationListPage.getApplicationListPageTitle(),"Oracle IRT");
	}
	
	@DataProvider
	public Object[][] getApplicationData(){
		Object data[][] = TestUtil.getTestData("Sheet1");
		return data;
	}
	@Test(priority=2,dataProvider="getApplicationData")
	public void loginTest(String applicationName) {
		applicationListPage.clickTheLink(applicationName);
		System.out.println(applicationName);
	} 
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
