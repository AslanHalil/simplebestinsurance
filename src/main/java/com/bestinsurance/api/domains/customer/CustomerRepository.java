package com.bestinsurance.api.domains.customer;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
