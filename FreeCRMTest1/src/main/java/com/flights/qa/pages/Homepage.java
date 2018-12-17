package com.flights.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flights.qa.base.TestBase;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.Slicing;

public class Homepage extends TestBase {

	@FindBy(xpath="html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")

WebElement loginmessagelabel;
	
@FindBy(xpath="//a[contains(text(),'Hotels')]")

WebElement HotelsLink;
		
@FindBy(xpath="//a[contains(text(),'REGISTER')]")

WebElement REGISTERlink;

@FindBy(xpath="//a[contains(text(),'Flights')]")

WebElement Flightslink;

public Homepage(){
	PageFactory.initElements(driver,this);
	
	
	}

public boolean verifyloginmessage() {
	
return loginmessagelabel.isDisplayed();

}


public String verifyHomepagelogintext() {
	return driver.getTitle();
	
	
	
}

public HotelsPage clickHotelsLink() {
	
	HotelsLink.click();
	return new HotelsPage();
}
public FlightsPage clickFlightsLink() {
	
	Flightslink.click();
	return new FlightsPage();
}


}
