package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Country;
import com.example.demo.model.State;

public class GetCountry {

	public String getCountry(String city) throws IOException, InterruptedException {

		RestTemplate restTemplate = new RestTemplate();
		String Url = "http://battuta.medunes.net/api/country/search/?city=" + city
				+ "&key=69f3e6db740c7d108f9f6be5460f2c8b";
		Country[] foo = restTemplate.getForObject(Url, Country[].class);
		String countryCode = foo[0].getCode();

		System.out.println(countryCode);
		Url = "http://battuta.medunes.net/api/city/" + countryCode + "/search/?city=" + city
				+ "&key=69f3e6db740c7d108f9f6be5460f2c8b";
		
		State[] foo2 = restTemplate.getForObject(Url, State[].class);
		System.out.println(foo2[0].toString());
		return foo2[0].getRegion();
	}
	
}
