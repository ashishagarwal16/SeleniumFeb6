package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookAFlight {
	
	@FindBy(name="passFirst0")
	private WebElement firstName;
	
	@FindBy(name="passLast0")
	private WebElement lastName;
	
	@FindBy(name="creditnumber")
	private WebElement creditCardNumber;
	
	@FindBy(name="buyFlights")
	private WebElement submit;
	
	
	public bookAFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void flishtBooking(String fname,String lname, String ccNumber) {
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		creditCardNumber.sendKeys(ccNumber);
		submit.click();
	}
	

}
