package com.atmecs.booikng.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.booking.constants.Flight_Book_Read;
import com.atmecs.booking.testbase.DriverSetup;

public class Flight_Book extends DriverSetup {
	Flight_Book_Read read = new Flight_Book_Read();

	@Test(priority = 4)
	public void bookFlight() {
		// driver.get(prop.getProperty("url"));
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name(read.getLocater("loc.firstname.txt"))).click();
		driver.findElement(By.name(read.getLocater("loc.firstname.txt"))).sendKeys("Saurabh");
		driver.findElement(By.name(read.getLocater("loc.lastname.txt"))).sendKeys("Chauhan");
		driver.findElement(By.name(read.getLocater("loc.mealdropdown.dpdn"))).click();
		{
			Select menuValues = new Select(driver.findElement(By.name(read.getLocater("loc.mealdropdown.dpdn"))));
			menuValues.selectByIndex(2);
		}
		driver.findElement(By.name(read.getLocater("loc.cardtype.dpdn"))).click();
		{
			Select cardType = new Select(driver.findElement(By.name(read.getLocater("loc.cardtype.dpdn"))));
			cardType.selectByVisibleText("MasterCard");
		}
		driver.findElement(By.name(read.getLocater("loc.cardnumber.txt"))).sendKeys("839373883736");
		driver.findElement(By.name(read.getLocater("loc.Expirationdate.dpdn"))).click();
		{
			Select expirationDate = new Select(driver.findElement(By.name(read.getLocater("loc.Expirationdate.dpdn"))));
			expirationDate.selectByVisibleText("05");
		}
		driver.findElement(By.name(read.getLocater("loc.Expiration_year.dpdn"))).click();
		{
			Select expirationDate = new Select(
					driver.findElement(By.name(read.getLocater("loc.Expiration_year.dpdn"))));
			expirationDate.selectByIndex(3);
		}
		driver.findElement(By.name(read.getLocater("loc.creditcardfirstname.txt"))).sendKeys("Saurabh");
		driver.findElement(By.name(read.getLocater("loc.creditcardmiddlename.txt"))).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Chauhan");
		driver.findElement(By.xpath("//input[@name='billAddress1")).sendKeys(" House no. 3, ");
		driver.findElement(By.name(read.getLocater("loc.bAddress.txt2"))).sendKeys(" Lane no.9 Rajendra nagar");
		driver.findElement(By.name(read.getLocater("loc.bcity.txt"))).sendKeys("Satna");
		
		
		driver.findElement(By.name(read.getLocater("loc.bstate.txt"))).sendKeys("Madhya Pradesh");
		driver.findElement(By.name(read.getLocater("loc.bpostalcode.txt"))).sendKeys("485001");
		driver.findElement(By.name(read.getLocater("loc.bcountry.dpdn"))).click();
		{
		Select country = new Select(driver.findElement(By.name(read.getLocater("loc.bcountry.dpdn"))));
		country.selectByIndex(14);
		}
		driver.findElement(By.name(read.getLocater("loc.dAddress.txt1"))).sendKeys(" Room no. 302, ");
		driver.findElement(By.name(read.getLocater("loc.dAddress.txt2"))).sendKeys(" Prashanth Hills");
		driver.findElement(By.name(read.getLocater("loc.dcity.txt"))).sendKeys("Hyderabad");
		driver.findElement(By.name(read.getLocater("loc.dstate.txt"))).sendKeys("Telangana");
		driver.findElement(By.name(read.getLocater("loc.dpostalcode.txt"))).sendKeys("582552");
		driver.findElement(By.name(read.getLocater("loc.dcountry.dpdn"))).click();
		{
		Select country = new Select(driver.findElement(By.name(read.getLocater("loc.dcountry.dpdn"))));
		country.selectByIndex(14);
		}
		driver.findElement(By.name(read.getLocater("loc.securepurchase.btn"))).click();
		}
	}

