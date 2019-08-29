package com.atmecs.booking.constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Select_Flight_Read {
	static String locater = null;

	public String getLocater(String element) {
		try (InputStream input = new FileInputStream(
				"./src/test/resources/locators/flight_select.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and return it to the calling method
			String[] arrOfStr = ((String) prop.getProperty(element)).split(":", 2);
			locater = arrOfStr[1];

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(locater);
		return locater;
	}

}
