package com.github.flcable.cities.api.repository;

import com.github.flcable.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
