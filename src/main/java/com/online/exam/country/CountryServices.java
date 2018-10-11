package com.online.exam.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryServices {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getAllCountry(){
		List<Country> countryes = new ArrayList();
		countryRepository.findAll()
			.forEach(countryes::add);
		return countryes;
		
	}
	
	public Optional<Country> getCountry(String id) {
		return countryRepository.findById(id);
	}
	
	public void addCountry(Country country) {
		countryRepository.save(country);	
	}
	
	public void updateCountry(String id, Country country) {
		countryRepository.save(country);
	}
	
	public void deleteCountry(String id, Country country) {
		countryRepository.save(country);
	}
}
