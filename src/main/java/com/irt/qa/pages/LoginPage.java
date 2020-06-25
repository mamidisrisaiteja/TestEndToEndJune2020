package com.irt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irt.qa.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(id="userID")
	WebElement userId;
	
	@FindBy(id="password")
	WebElement password;
	


	@FindBy(id="Submit")
	WebElement enterButton;
	
	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	public String getLoginPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
		
	}
	public ApplicationListPage login(String un,String pwd) {
		 userId.sendKeys(un);
		 password.sendKeys(pwd);
		 enterButton.click();
		 return new ApplicationListPage();
		
	}
}
