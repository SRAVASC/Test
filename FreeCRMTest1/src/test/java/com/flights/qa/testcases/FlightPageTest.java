package com.flights.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flights.qa.base.TestBase;
import com.flights.qa.pages.FlightsPage;
import com.flights.qa.pages.Homepage;
import com.flights.qa.pages.LoginPage;
import com.flights.qa.util.TestUtil;

public class FlightPageTest extends TestBase {
	
	LoginPage loginPage;
	Homepage homepage;
	TestUtil testUtil;
	
	//FlightsPage hotelsPage;
	FlightsPage flightsPage;
	FlightPageTest(){
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
	
	public void verifyFlightimagelabel(){	
		
		Assert.assertTrue(flightsPage.FlightImage(),"Flights image is missing in the page");
		
		
	}
	@Test(priority=2)
	public void verifyradiobuttomclick() {
		
		flightsPage.clickonewayradio();
	}

}
