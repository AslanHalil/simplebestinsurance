package com.bestinsurance.api.domains.state;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface StateRepository extends CrudRepository<State, UUID> {
}
