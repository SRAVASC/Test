package com.flights.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flights.qa.base.TestBase;
import com.flights.qa.pages.Homepage;
import com.flights.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	Homepage homePage;
	public LoginPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup(){
		initialisation();
	 loginPage = new LoginPage();
		
	}
	
@Test(priority=1)
public void LoginPageTitletest() {
String title=loginPage.validateloginPageTitile();
Assert.assertEquals(title,"MERCURY TOURS");
}
@Test(priority=2)

public void LoginPageImage() {
	boolean flag=loginPage.validateFlightImage();
	
	
}

@Test(priority=3)

public void siginin() {

homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));



}

@AfterMethod

public void tearDown() {
	
	driver.quit();
}
}