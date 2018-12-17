package com.flights.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flights.qa.base.TestBase;
import com.flights.qa.pages.FlightsPage;
import com.flights.qa.pages.Homepage;
import com.flights.qa.pages.HotelsPage;
import com.flights.qa.pages.LoginPage;
import com.flights.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	Homepage homepage;
	TestUtil testUtil;
	//FlightsPage hotelsPage;
	FlightsPage flightsPage;
	public HomePageTest() {
		
		super();
		
		
	}
	@BeforeMethod
	public void seup() {
		
		loginPage= new LoginPage();
		initialisation();
		testUtil=new TestUtil();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	

@Test(priority=1)

public void verifyHomePageTitleTest() {
	
	String HomePageTitle=homepage.verifyHomepagelogintext();
	Assert.assertEquals(HomePageTitle, "Mercury TOURS","Home page title not matched");
	
}
	@Test(priority=2)
	public void verifyhomepagemessagetext() {
		
		testUtil.switchToFrame();
		Assert.assertTrue(homepage.verifyloginmessage());
	}
@Test(priority=3)
	public void verifyHotelsLinkTest() {
	
	/*testUtil.switchToFrame();
		
hotelsPage=homepage.clickHotelsLink();
	}
@Test(priority=4)
public void verifyFlightsLinkTest() {*/

testUtil.switchToFrame();
	
flightsPage=homepage.clickFlightsLink();
}

@AfterMethod
public void tearDown() {
	
	driver.quit();
}





	
}
