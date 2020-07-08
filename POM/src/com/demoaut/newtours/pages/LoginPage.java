package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(name="userName")
	private WebElement Uname;
	
	@FindBy(name="password")
	private WebElement Pass;
	
	@FindBy(name="login")
	private WebElement signIn;
	
	public void signinapplication() {
		
		Uname.sendKeys("mercury");
		Pass.sendKeys("mercury");
		signIn.submit();
		
	}
}
