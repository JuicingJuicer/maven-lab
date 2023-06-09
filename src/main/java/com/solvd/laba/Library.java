package com.solvd.laba;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

final public class Library {
	private String name;
	private String city;
	private static final Logger logger = LogManager.getLogger(Library.class.getName());

	public Library(String name, String city) {
		this.setName(name);
		this.setCity(city);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public void greetings() {
		logger.info("Welcome to " + this.name + " of " + this.city + "!");
	}
}
