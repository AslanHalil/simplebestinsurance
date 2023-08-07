package com.bestinsurance.api.domains.country;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CountryRepository extends CrudRepository<Country, UUID> {
}
