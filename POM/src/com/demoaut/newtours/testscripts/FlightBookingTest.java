package com.demoaut.newtours.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demoaut.newtours.pages.BookFlight;
import com.demoaut.newtours.pages.FlightConfirmation;
import com.demoaut.newtours.pages.FlightFinder;
import com.demoaut.newtours.pages.LoginPage;
import com.demoaut.newtours.pages.SelectFlight;

public class FlightBookingTest {

	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void openapplication(String browser) {
		
		if (browser.equals("Chrome")) 
		{
			driver= new ChromeDriver();
		}
		
		else if (browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	
	public void flightbooking() {
		
		LoginPage lp= new LoginPage(driver);
		FlightFinder ff =new FlightFinder(driver);
		SelectFlight sf=new SelectFlight(driver);
		BookFlight bf=new BookFlight(driver);
		FlightConfirmation fc=new FlightConfirmation(driver);
		
		
		
		lp.signinapplication();
		ff.findpageapplicatiion();
		sf.slectflightapplication();
		bf.bookapplication("Hiren","Oza", "236726376729763972");
		String actualMsg=fc.flightconfirm();
		String expectedMsg ="Your itinerary has been booked!";
		Assert.assertEquals(actualMsg, expectedMsg);
	}
		
	
	@AfterTest
	
	public void closeapplication() {
		driver.quit();
	}
	
}
