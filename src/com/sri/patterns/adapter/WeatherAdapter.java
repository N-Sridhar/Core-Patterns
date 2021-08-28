package com.sri.patterns.adapter;

public class WeatherAdapter {
	public int findTemperature(int zipcode) {
		String city = null;

		if (zipcode == 641666) {
			city = "tiruppur";
		}

		WeatherFinderImpl finder = new WeatherFinderImpl();
		int temperature = finder.find(city);

		return temperature;
	}
}
