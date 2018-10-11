package com.online.exam.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, String>{

}
