package com.bestinsurance.api.domains.coverage;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CoverageRepository extends CrudRepository<Coverage, UUID> {
}
