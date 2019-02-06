package com.demoaut.newtours.Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookFlight {
	
	@FindBy(name="passFirst0")
	private WebElement firstName;
	
	@FindBy(name="passLast0")
	private WebElement lastName;
	
	@FindBy(name="creditnumber")
	private WebElement ccNumber;
	
	@FindBy(name="buyFlights")
	private WebElement submit;
	
	public bookFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void flightdetails(String fname, String lname, String ccNo) {
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		ccNumber.sendKeys(ccNo);
		submit.click();
	}

}
