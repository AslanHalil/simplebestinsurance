package com.bestinsurance.api.domains.city;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CityRepository extends CrudRepository<City, UUID> {
}
