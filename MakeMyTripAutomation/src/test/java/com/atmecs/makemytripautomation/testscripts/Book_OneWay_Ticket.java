package com.atmecs.makemytripautomation.testscripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.makemytripautomation.constants.OneWayTrip;
import com.atmecs.makemytripautomation.dataprovider.CityDataProvider;
import com.atmecs.makemytripautomation.dataprovider.TestDataProvider;
import com.atmecs.makemytripautomation.helpers.CommonUtility;
import com.atmecs.makemytripautomation.testbase.TestBase;

public class Book_OneWay_Ticket extends TestBase {
	OneWayTrip one_way_trip = new OneWayTrip();

	@Test(priority = 1, dataProvider = "cityinput", dataProviderClass = CityDataProvider.class)
	public void homePage(String fromCity, String toCity) {

		CommonUtility.clickElement(driver, one_way_trip.getLoc_oneway_rbtn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_from_box());
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_from_inputtext(), 2, fromCity);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CommonUtility.clickElement(driver, one_way_trip.getLoc_from_search());
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_to_box(), 2, toCity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CommonUtility.clickElement(driver, one_way_trip.getLoc_to_search());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_departure_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_calender_departure_date_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_class_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_adults_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_children_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_infants_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_choose_travel_class_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_apply_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_search_btn());

	}

	@Test(priority = 2)
	public void selectFlightAndReview() {
		CommonUtility.clickElement(driver, one_way_trip.getLoc_sortby_departure_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_book_now_btn());
		Set<String> windowhandle = driver.getWindowHandles();
		Iterator<String> iterator = windowhandle.iterator();
		iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
		CommonUtility.scrollDownPage(driver);
		driver.switchTo().frame("webpush-bubble");
		driver.findElement(By.xpath("//button[text()=\"I'll do this later\"]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CommonUtility.clickElement(driver, one_way_trip.getLoc_continue_btn());
	}

	@Test(priority = 3, dataProvider = "testinput", dataProviderClass = TestDataProvider.class)
	public void travellersDetails(String firstname, String lastname, String firstname1, String lastname1, String mob_no,
			String email) {

		CommonUtility.clickElement(driver, one_way_trip.getLoc_add_adult_btn());
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_firstname_btn(), 2, firstname);
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_lastname_btn(), 2, lastname);
		CommonUtility.clickElement(driver, one_way_trip.getLoc_f_gender_rbtn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_add_adult_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_cursorup_btn());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CommonUtility.clickAndSendText(driver, "(" + (one_way_trip.getLoc_firstname_btn()) + ")[2]", 2, firstname1);
		CommonUtility.clickAndSendText(driver, "(" + (one_way_trip.getLoc_lastname_btn()) + ")[2]", 2, lastname1);
		CommonUtility.clickElement(driver, "(" + (one_way_trip.getLoc_f_gender_rbtn()) + ")[2]");
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_contact_info_mob_no_text(), 2, mob_no);
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_contact_info_email_text(), 2, email);
		CommonUtility.clickElement(driver, one_way_trip.getLoc_flight_details_continue_btn());
	}

}
