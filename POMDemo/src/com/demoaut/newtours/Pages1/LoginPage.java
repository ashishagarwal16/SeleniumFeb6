package com.demoaut.newtours.Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement submit;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin() {
		username.sendKeys("mercury");
		password.sendKeys("mercury");
		submit.click();
	}
	
}
