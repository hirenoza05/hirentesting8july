package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {

	
	public BookFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="passFirst0")
	private WebElement fname;
	
	
	@FindBy(name="passLast0")
	private WebElement lname;
	
	@FindBy(name="creditCard")
	private WebElement cc;
	
	@FindBy (name="creditnumber")
	private WebElement cnumber;
	
	@FindBy(name="buyFlights")
	private WebElement login;
	
	public void bookapplication(String firstname, String lastname, String creditcardnumber) {
		
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		Select credit= new Select (cc);
		credit.selectByIndex(2);
		cnumber.sendKeys(creditcardnumber);
		login.submit();
		
	}
	
}
