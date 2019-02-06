package com.demoaut.newtours.testscript1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages1.LoginPage;
import com.demoaut.newtours.Pages1.bookFlight;
import com.demoaut.newtours.Pages1.flightConfirmation;
import com.demoaut.newtours.Pages1.flightFinder;
import com.demoaut.newtours.Pages1.selectFlight;

public class bookTicket {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
	}

	@Test
	public void bookTicketLatest() {
		LoginPage lp = new LoginPage(driver);
		flightFinder ff = new flightFinder(driver);
		selectFlight sf = new selectFlight(driver);
		bookFlight bf = new bookFlight(driver);
		flightConfirmation fc = new flightConfirmation(driver);
		

		lp.applicationLogin();
		ff.findFlight();
		sf.flightSelection();
		bf.flightdetails("Jyoti", "Agarwal", "111-222-333-444");
		
		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = fc.getSuccessMessage().getText();
		
		Assert.assertEquals(expectedMessage, actualMessage);
		
	}
	@AfterTest
	
	public void closeBrowser() {
	}

}
