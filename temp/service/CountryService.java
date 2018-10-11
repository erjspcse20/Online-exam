package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.model.CountryModel;
import com.online.exam.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<CountryModel> getAllCountry(){
		List<CountryModel> countryes = new ArrayList();
		countryRepository.findAll()
			.forEach(countryes::add);
		return countryes;
		
	}
	
	public Optional<CountryModel> getCountry(Integer id) {
		return countryRepository.findById(id);
	}
	
	public void addCountry(CountryModel country) {
		countryRepository.save(country);	
	}
	
	public void updateCountry(Integer id, CountryModel country) {
		countryRepository.save(country);
	}
	
	public void deleteCountry(Integer id, CountryModel country) {
		countryRepository.save(country);
	}
}
