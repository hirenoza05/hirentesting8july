package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {

	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="passCount")
	private WebElement passenger;
	
	
	@FindBy(name="fromPort")
	private WebElement placeFrom;
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(4)")
	private WebElement seatClass;
	
	@FindBy(name="findFlights")
	private WebElement clickContinue;
	
	
	public void findpageapplicatiion() {
		
		Select ddDate= new Select(passenger);
		ddDate.selectByIndex(2);
		
		Select ddProt= new Select(placeFrom);
		ddProt.selectByValue("London");
		
		seatClass.click();
		
		clickContinue.click();
		
	}
	
	
}
