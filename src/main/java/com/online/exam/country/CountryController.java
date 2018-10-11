package com.online.exam.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "cou/api")
public class CountryController {
	@Autowired
	private CountryServices countryService;
	
	@RequestMapping(value = "/allcountry")
	public List<Country> getAllCountry(){
		return countryService.getAllCountry();
	}
	
	@RequestMapping(value = "/countries/{id}")
	public Optional<Country> getCountry(@PathVariable String id) {
		return countryService.getCountry(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addCountry")
	public void addCountry(@RequestBody Country country) {
		countryService.addCountry(country);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/updateCountry/{id}")
	public void updateTopic(@RequestBody Country country, @PathVariable String id) {
		countryService.updateCountry(id, country);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/delCountry/{id}")
	public void deleteTopic(@RequestBody Country country, @PathVariable String id) {
		countryService.deleteCountry(id, country);
	}
}
