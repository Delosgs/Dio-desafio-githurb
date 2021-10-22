package com.delanogs.Cities_Api.countries.repositories;

import com.delanogs.Cities_Api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
