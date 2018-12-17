package com.flights.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flights.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase(){
		
		prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream(System.getProperty("C:/Users/sandh/eclipse-workspace/FreeCRMTest1/src/main/java/com/flights/qa/config/config.properties"));
		prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	public static void initialisation() {
		
		String browserName=prop.getProperty("Browser");
		if(browserName.equals("chrome")) {
			System.setProperty("Webdriver.chromedriver","C://Selenium jars_QA2QE_LC/Selenium_Jars/chromedriver_win32");
			
			driver=new ChromeDriver();
		}
		
		else {
			if(browserName.contentEquals("FF")) {
				
				System.setProperty("Webdriver.geckoDriver","C://Selenium jars_QA2QE_LC/Selenium_Jars/gecko driver file/geckodriver-v0.16.0-win64");
			
			
			driver =new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
}
