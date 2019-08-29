package com.atmecs.booikng.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.booking.constants.Select_Flight_Read;
import com.atmecs.booking.testbase.DriverSetup;

public class SelectFlightPageTest extends DriverSetup {
	Select_Flight_Read select_flight_read = new Select_Flight_Read();

	@Test(priority = 1)
	public void selectFlight() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("loc.pangea_airlines_362.rbtn")).click();
		driver.findElement(By.xpath("loc.blue_skies_airlines_631.rbtn")).click();
	}

}
