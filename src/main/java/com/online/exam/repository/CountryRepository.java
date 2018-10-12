package com.online.exam.repository;

import org.springframework.data.repository.CrudRepository;

import com.online.exam.model.CountryModel;

public interface CountryRepository extends CrudRepository<CountryModel, Integer>{

}
