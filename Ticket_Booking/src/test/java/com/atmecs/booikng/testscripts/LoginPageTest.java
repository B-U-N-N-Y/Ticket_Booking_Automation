package com.atmecs.booikng.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.booking.constants.Flight_Details_Read;
import com.atmecs.booking.constants.Login_Property_Read;
import com.atmecs.booking.constants.Select_Flight_Read;
import com.atmecs.booking.testbase.DriverSetup;

public class LoginPageTest extends DriverSetup {
	Login_Property_Read login_read = new Login_Property_Read();
	Flight_Details_Read read=new Flight_Details_Read();
	Select_Flight_Read select_flight_read=new Select_Flight_Read();


	@Test(priority = 1)
	public void loginPageTest() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WebElement login_username = (driver.findElement(By.name(login_read.getLocater("loc.login.username.txt"))));
		login_username.click();
		login_username.sendKeys("mercury");
		WebElement login_password=(driver.findElement(By.name(login_read.getLocater("loc.login.password.txt"))));
		login_password.click();
		login_password.sendKeys("mercury");
		WebElement login_signin=(driver.findElement(By.name(login_read.getLocater("loc.login.signin.btn"))));
		login_signin.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 2)
	public void flightDetails()  {
	// driver.get(prop.getProperty("url"));
		// driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(read.getLocater("loc.roundTrip.rbtn"))).click();
		driver.findElement(By.name(read.getLocater("loc.passengers.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.passengers.dpdn")));
			dropdown.findElement(By.xpath("//option[@value= '3']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.passengers.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.departingFrom.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.departingFrom.dpdn")));
			dropdown.findElement(By.xpath("//option[@value='Acapulco']")).click();
			System.out.println("HO Gaya");
		}
		driver.findElement(By.name(read.getLocater("loc.departingFrom.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.on.month.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.on.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '1']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.on.month.dpdn")));
		driver.findElement(By.name(read.getLocater("loc.on.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.on.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '21']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.on.day.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.arrivingIn.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.arrivingIn.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = 'Paris']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.arrivingIn.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.returning.month.dpdn"))).click();// loc.returning.month.dpdn
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.returning.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.returning.month.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.returning.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.returning.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.returning.day.dpdn"))).click();
		driver.findElement(By.cssSelector(read.getLocater("loc.serviceClass.economy.rbtn"))).click();
		driver.findElement(By.cssSelector(read.getLocater("loc.serviceClass.business.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater("loc.serviceClass.firstClass.rbtn"))).click();
		driver.findElement(By.name(read.getLocater("loc.airline.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.airline.dpdn")));
			dropdown.findElement(By.xpath("//option[text()= 'Blue Skies Airlines']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.airline.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.continue.btn"))).click();
	}
	
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
