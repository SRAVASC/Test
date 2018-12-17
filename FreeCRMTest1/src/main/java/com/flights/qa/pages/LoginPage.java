package com.flights.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flights.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory-OR:
	
	
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="submit")
	WebElement signinBtn;
@FindBy(xpath="html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
WebElement RegisterBtn;

@FindBy(xpath="html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img")
WebElement FlightlOGO;

//Initialising the page objects(Constrcutor)

public LoginPage() {
PageFactory.initElements(driver, this);

	
	
}

//Actions

public String validateloginPageTitile() {
	
	return driver.getTitle();
	
}

public boolean validateFlightImage() {
	
	return FlightlOGO.isDisplayed();

}
public Homepage login(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	signinBtn.click();
	return new Homepage();
	
		
}


}
