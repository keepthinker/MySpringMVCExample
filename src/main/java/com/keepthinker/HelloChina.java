package com.keepthinker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloChina {
	public Logger logger=Logger.getLogger(HelloChina.class);
	private String message1;
	private String message2;
	private String message3;
	private Capital capital;
	private President president;
	private List<String> provices;
	private Map<String,String> specialAreas;
	private Properties regions;
	private People people;
	public HelloChina(Capital capital, President president,
			List<String> provices, Map<String, String> specialAreas,
			Properties regions) {
		super();
		this.capital = capital;
		this.president = president;
		this.provices = provices;
		this.specialAreas = specialAreas;
		this.regions = regions;
	}


	public People getPeople() {
		return people;
	}

	@Autowired
	@Qualifier("people1")
	public void setPeople(People people) {
		this.people = people;
	}


	public President getPresident() {
		return president;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	public List<String> getProvices() {
		return provices;
	}

	public void setProvices(List<String> provices) {
		this.provices = provices;
	}

	public Map<String, String> getSpecialAreas() {
		return specialAreas;
	}

	public void setSpecialAreas(Map<String, String> specialAreas) {
		this.specialAreas = specialAreas;
	}

	public Properties getRegions() {
		return regions;
	}

	public void setRegions(Properties regions) {
		this.regions = regions;
	}

	public void init(){
		logger.info("initialize HelloChina");
	}
	public void destroy(){
		logger.info("destroy HelloChina");
	}
}
