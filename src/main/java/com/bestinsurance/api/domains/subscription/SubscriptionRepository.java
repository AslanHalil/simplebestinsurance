package com.bestinsurance.api.domains.subscription;

import org.springframework.data.repository.CrudRepository;


public interface SubscriptionRepository extends CrudRepository<Subscription, SubscriptionId> {
}
