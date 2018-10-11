package com.online.exam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.exam.model.CountryModel;
import com.online.exam.service.CountryService;

@RestController
@RequestMapping(value = "country/api")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value = "/allCountry")
	public List<CountryModel> getAllCountry(){
		return countryService.getAllCountry();
	}
	
	@RequestMapping(value = "/countries/{id}")
	public Optional<CountryModel> getCountry(@PathVariable Integer id) {
		return countryService.getCountry(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addCountry")
	public void addCountry(@RequestBody CountryModel country) {
		countryService.addCountry(country);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/updateCountry/{id}")
	public void updateTopic(@RequestBody CountryModel country, @PathVariable Integer id) {
		countryService.updateCountry(id, country);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/delCountry/{id}")
	public void deleteTopic(@RequestBody CountryModel country, @PathVariable Integer id) {
		countryService.deleteCountry(id, country);
	}

}
