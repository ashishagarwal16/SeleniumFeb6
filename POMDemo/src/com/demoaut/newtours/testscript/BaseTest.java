package com.demoaut.newtours.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	WebDriver driver;

	@BeforeClass

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
