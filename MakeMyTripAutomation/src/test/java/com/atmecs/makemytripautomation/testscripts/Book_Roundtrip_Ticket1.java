package com.atmecs.makemytripautomation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.makemytripautomation.constants.RoundTrip;
import com.atmecs.makemytripautomation.helpers.CommonUtility;
import com.atmecs.makemytripautomation.testbase.TestBase;

public class Book_Roundtrip_Ticket1 extends TestBase {
	RoundTrip roundtrip = new RoundTrip();

	@Test(priority = 1)
	public void homePage() {

		CommonUtility.clickElement(driver, roundtrip.getLoc_round_trip_rbtn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_from_box());
		CommonUtility.clickAndSendText(driver, roundtrip.getLoc_from_inputtext(), 2, "Hyderabad");
		CommonUtility.clickElement(driver, roundtrip.getLoc_from_search());
		System.out.println("1st");
		CommonUtility.clickAndSendText(driver, roundtrip.getLoc_to_box(), 2, "Kolkata");
		System.out.println("2nd");
		CommonUtility.clickElement(driver, roundtrip.getLoc_to_search());
		CommonUtility.clickElement(driver, roundtrip.getLoc_departure_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_calender_departure_date_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_departure_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_calender_return_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_calender_nextmont_btn());
		System.out.println("3nd");
		CommonUtility.clickElement(driver, roundtrip.getLoc_calender_return_date_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_traveller_class_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_traveller_adults_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_traveller_children_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_traveller_infants_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_traveller_choose_travel_class_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_traveller_apply_btn());
		CommonUtility.clickElement(driver, roundtrip.getLoc_search_btn());
	}
}
