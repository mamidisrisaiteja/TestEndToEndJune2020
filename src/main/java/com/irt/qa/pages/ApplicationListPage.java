package com.irt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irt.qa.base.TestBase;

public class ApplicationListPage extends TestBase {
@FindBy(xpath="//a[contains(text(),'Alliance')]")
WebElement link1;

@FindBy(xpath="//a[contains(text(),'Merck')]")
WebElement link2;


public ApplicationListPage() {
	
PageFactory.initElements(driver, this);

}
public String getApplicationListPageTitle() {
	return driver.getTitle();
}

public HomePage clickTheLink(String applicationName) {
	    if(applicationName.contains("Alliance")){
           link1.click();
          
         }
	    else if(applicationName.contains("Merck")){
          link2.click();
	    }
          return new HomePage();
	    
}


}