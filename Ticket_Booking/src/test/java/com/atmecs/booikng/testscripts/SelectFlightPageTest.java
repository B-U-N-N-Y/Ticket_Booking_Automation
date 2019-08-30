package com.atmecs.booikng.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.booking.constants.Select_Flight_Read;
import com.atmecs.booking.testbase.DriverSetup;

public class SelectFlightPageTest extends DriverSetup {
	Select_Flight_Read select_flight_read = new Select_Flight_Read();

	@Test(priority = 3)
	public void selectFlight() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.blue_skies_airlines_361.rbtn"))).click();
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.pangea_airlines_362.rbtn"))).click();
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.unified_airlines_363.rbtn"))).click();
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.pangea_airlines_632.rbtn"))).click();
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.blue_skies_airlines_631.rbtn"))).click();
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.unified_airlines_633.rbtn"))).click();
		driver.findElement(By.xpath(select_flight_read.getLocater("loc.continue.btn"))).click();

	}

}
