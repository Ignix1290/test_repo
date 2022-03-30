package com.zensar;

import java.util.Arrays;
import java.util.List;

public class CityServiceStub implements CityService{

	@Override
	public List<String> findCitiesByCountries(String country) {
		// TODO Auto-generated method stub
		if(country.equalsIgnoreCase("INDIA")) {
			cities = Arrays.asList("Pune","Mumbai","Delhi");
		}
		else if(country.equalsIgnoreCase("USA")) {
			cities = Arrays.asList("New York","Washington");
		}
		return cities;
	}

}
