package com.example.demo.model;

import java.io.Serializable;

public class State implements Serializable {
	private String city;
	private String region;
	private String country;
	private String latitude;
	private String longitude;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountryName() {
		return country;
	}

	public void setCountryName(String countryName) {
		this.country = countryName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "State [city=" + city + ", region=" + region + ", countryName=" + country + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}

}
