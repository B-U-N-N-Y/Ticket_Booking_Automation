package com.atmecs.booikng.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.atmecs.booking.constants.Flight_Details_Read;
import com.atmecs.booking.constants.Login_Property_Read;
import com.atmecs.booking.constants.Select_Flight_Read;
import com.atmecs.booking.testbase.DriverSetup;

public class LoginPageTest extends DriverSetup {
	Login_Property_Read login_read = new Login_Property_Read();
	Flight_Details_Read read = new Flight_Details_Read();
	Select_Flight_Read select_flight_read = new Select_Flight_Read();

	@AfterSuite
	public void endTest() {
		driver.close();
	}

	@Test(priority = 1)
	public void loginPageTest() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WebElement login_username = (driver.findElement(By.name(login_read.getLocater("loc.login.username.txt"))));
		login_username.click();
		login_username.sendKeys("mercury");
		WebElement login_password = (driver.findElement(By.name(login_read.getLocater("loc.login.password.txt"))));
		login_password.click();
		login_password.sendKeys("mercury");
		WebElement login_signin = (driver.findElement(By.name(login_read.getLocater("loc.login.signin.btn"))));
		login_signin.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
