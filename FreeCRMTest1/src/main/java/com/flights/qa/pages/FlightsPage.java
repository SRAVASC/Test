package com.flights.qa.pages;

/*import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flights.qa.base.TestBase;

public class FlightsPage extends TestBase {
	
	@FindBy(xpath="html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")

	WebElement FlightImage;
	@FindBy(xpath="html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement Flightsearchradiobutton;
	//Initialising the page objects
	
	FlightsPage(){
		
		PageFactory.initElements(driver,this);
	}
	
	public boolean FlightImage() {
		return FlightImage.isDisplayed();
		
	}
	
	public void clickonewayradio() {
		
		Flightsearchradiobutton.click();
	}
	
}*/

public class FlightsPage {
      public static void main(String args[]){
          int num1, num2;
          //check whether any value is entered or not.
          if (args.length > 0) {
           try {
            //parse string values to integer
              num1 = Integer.parseInt(args[0]);
              num2 = Integer.parseInt(args[1]);
 
              System.out.println("Sum of entered numbers = ");
              System.out.println(num1 + num2);
           } catch (NumberFormatException e) {
            //Catch exception if any in parsing.
              System.err.println("Argument must be an integer.");
           }
         }
      }
}
