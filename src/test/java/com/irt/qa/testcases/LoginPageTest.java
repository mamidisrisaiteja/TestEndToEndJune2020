package com.irt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.irt.qa.base.TestBase;
import com.irt.qa.pages.ApplicationListPage;
import com.irt.qa.pages.HomePage;
import com.irt.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPage loginPage;
	public HomePage homePage;
	public ApplicationListPage applicationListPage;
	
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
	}
	@Test(priority=1)
	public void validateLoginPageTitle() {
		
		String title=loginPage.getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Oracle IRT");
	}
	@Test(priority=2)
	public void loginTest() {
		applicationListPage=loginPage.login(prop.getProperty("userId"),prop.getProperty("password"));
	} 

}
