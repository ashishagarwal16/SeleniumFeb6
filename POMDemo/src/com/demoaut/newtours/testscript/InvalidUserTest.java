package com.demoaut.newtours.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

public class InvalidUserTest extends BaseTest {

	@Test
	public void invalidUserTest() {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);
		lp.applicationLogin("abc@gmail.com", "password");
		Boolean signOnStatus = so.getSignOn().isDisplayed();

		Assert.assertTrue(signOnStatus);

	}

}
