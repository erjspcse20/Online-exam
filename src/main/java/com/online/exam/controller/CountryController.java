package com.online.exam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.exam.model.CountryModel;
import com.online.exam.repository.CountryRepository;

@RestController
@RequestMapping(value = "/country/api")
public class CountryController {
	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping("/allCountry")
	public List<CountryModel> getAllCountrys() {
		List<CountryModel> Countrys = new ArrayList();
		countryRepository.findAll()
			.forEach(Countrys::add);
		return Countrys;
	}
	
	@RequestMapping("/country/{id}")
	public Optional<CountryModel> getCountry(@PathVariable Integer id) {
		//either you can give same name as parameter argument 
		//or put path variable name of request mapping to path
		//variable
		return countryRepository.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addCountry")
	public void addCountry(@RequestBody CountryModel CountryModel) {
		countryRepository.save(CountryModel);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updatecountry/{id}")
	public void updateCountry(@RequestBody CountryModel CountryModel, @PathVariable Integer id) {
		countryRepository.save(CountryModel);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deletecountry/{id}")
	public void deleteCountry(@RequestBody CountryModel CountryModel, @PathVariable Integer id) {
		countryRepository.save(CountryModel);
	}
}
