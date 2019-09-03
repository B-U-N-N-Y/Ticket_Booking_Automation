package com.atmecs.makemytripautomation.constants;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.makemytripautomation.utils.ReadPropertiesFile;

public class RoundTrip extends OneWayTrip {
	Properties property;
	private String loc_round_trip_rbtn;
	private String loc_calender_departure_btn;
	private String loc_calender_departure_date_btn;
	private String loc_calender_return_date_btn;
	private String loc_calender_nextmont_btn;
	private String loc_departuresortby_dpdn;
	private String loc_returnsortby_dpdn;
	private String loc_select_departure_flight_rbtn;
	private String loc_select_return_flight_rbtn;
	private String loc_booknow_rtrip_btn;
	

	public RoundTrip() {
		try {
			property = ReadPropertiesFile.loadProperty(FilePath.ROUNDTRIP_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
	public void setloc_round_trip_rbtn (){
		this.loc_round_trip_rbtn= property.getProperty("loc.round_trip.rbtn");
	}
	public String getloc_calender_departure_btn() {
		return loc_calender_departure_btn;
	}

	public void setloc_calender_departure_btn() {
		this.loc_calender_departure_btn= property.getProperty("loc.calender.departure.btn");
	}
	public String getLoc_calender_return_date_btn() {
		return loc_calender_return_date_btn;
	}
	//yha se
	public String getLoc_round_trip_rbtn() {
		return loc_round_trip_rbtn;
	}
	public void setLoc_round_trip_rbtn() {
		this.loc_round_trip_rbtn = property.getProperty("loc.round_trip.rbtn");
	}
	public String getLoc_calender_departure_date_btn() {
		return loc_calender_departure_date_btn;
	}
	public void setLoc_calender_departure_date_btn() {
		this.loc_calender_departure_date_btn = property.getProperty("loc.calender.departure_date.btn");
	}
	public String getLoc_calender_nextmont_btn() {
		return loc_calender_nextmont_btn;
	}
	public void setLoc_calender_nextmont_btn(String loc_calender_nextmont_btn) {
		this.loc_calender_nextmont_btn = property.getProperty("loc.calender.nextmont.btn");
	}
	public String getLoc_departuresortby_dpdn() {
		return loc_departuresortby_dpdn;
	}
	public void setLoc_departuresortby_dpdn() {
		this.loc_departuresortby_dpdn = property.getProperty("loc.departuresortby.dpdn");
	}
	public String getLoc_returnsortby_dpdn() {
		return loc_returnsortby_dpdn;
	}
	public void setLoc_returnsortby_dpdn() {
		this.loc_returnsortby_dpdn = property.getProperty("loc.returnsortby.dpdn");
	}
	public String getLoc_select_departure_flight_rbtn() {
		return loc_select_departure_flight_rbtn;
	}
	public void setLoc_select_departure_flight_rbtn() {
		this.loc_select_departure_flight_rbtn = property.getProperty("loc.select_departure_flight.rbtn");
	}
	public String getLoc_select_return_flight_rbtn() {
		return loc_select_return_flight_rbtn;
	}
	public void setLoc_select_return_flight_rbtn() {
		this.loc_select_return_flight_rbtn = property.getProperty("loc.select_return_flight.rbtn");
	}
	public String getloc_round_trip_rbtn() {
		return loc_round_trip_rbtn;
	}

	public void setLoc_calender_return_date_btn() {
		this.loc_calender_return_date_btn = property.getProperty("loc.calender.return_date.btn");
	}
	public String getLoc_booknow_rtrip_btn() {
		return loc_booknow_rtrip_btn;
	}
	public void setLoc_booknow_rtrip_btn() {
		this.loc_booknow_rtrip_btn = property.getProperty("loc.booknow.rtrip.btn");
	}
}
