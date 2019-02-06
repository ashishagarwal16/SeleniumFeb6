package com.demoaut.newtours.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.bookAFlight;
import com.demoaut.newtours.Pages.flightConfirmation;
import com.demoaut.newtours.Pages.flightFinder;
import com.demoaut.newtours.Pages.selectFlught;

public class bookTicketTest extends BaseTest {

	@Test

	public void bookTicketTest() {
		Login lp = new Login(driver);
		flightFinder ff = new flightFinder(driver);
		selectFlught sf = new selectFlught(driver);
		bookAFlight bf = new bookAFlight(driver);
		flightConfirmation fc = new flightConfirmation(driver);

		lp.applicationLogin("mercury", "mercury");
		ff.findFlight();
		sf.flightSelection();
		bf.flishtBooking("Ashish", "Agarwal", "111-222-333-444");

		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = fc.getSuccessMessage().getText();

		Assert.assertEquals(expectedMessage, actualMessage);

	}

}
