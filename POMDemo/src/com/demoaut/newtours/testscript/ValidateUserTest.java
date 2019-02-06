package com.demoaut.newtours.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.flightFinder;

public class ValidateUserTest extends BaseTest{
	
	
	
	@Test
	
	public void userValidation() {
		Login lp = new Login(driver);
		flightFinder ff = new flightFinder(driver);
		lp.applicationLogin("mercury", "mercury");
		Boolean signOffStatus = ff.getSignOff().isDisplayed();
		Assert.assertTrue(signOffStatus);
		
	}

	
	
}
