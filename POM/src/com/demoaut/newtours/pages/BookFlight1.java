package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight1 {
	
	public BookFlight1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="passFirst0")
	private WebElement pasfirstname;
	
	@FindBy(name="passLast0")
	private WebElement paslastname;
	
	@FindBy(name="buyFlights")
	private WebElement login;
	
	public void  bookingapplication(String firstname, String lastname ) {

		
		pasfirstname.sendKeys(firstname);
		paslastname.sendKeys(lastname);
		login.submit();
	
	}
	

}
