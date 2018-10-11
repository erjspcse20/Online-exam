package com.online.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.model.CountryModel;

public interface CountryRepository extends JpaRepository<CountryModel, String> {

}
