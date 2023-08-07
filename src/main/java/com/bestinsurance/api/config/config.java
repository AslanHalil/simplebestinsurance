package com.bestinsurance.api.config;

import com.bestinsurance.api.SampleDataLoader;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.OffsetDateTime;
import java.util.Optional;

@Configuration
@EntityScan("com.bestinsurance.api.domains")
@ComponentScan({"com.bestinsurance.api.domains"})
@EnableJpaRepositories("com.bestinsurance.api.domains")
@EnableTransactionManagement
@EnableJpaAuditing(dateTimeProviderRef = "auditingDateTimeProvider")
public class config {
    @Bean(name = "auditingDateTimeProvider")
    public DateTimeProvider dateTimeProvider() {
        return () -> Optional.of(OffsetDateTime.now());
    }

    @Bean
    @ConditionalOnProperty(prefix = "dataloader", name = "loadsample", havingValue = "true")
    public SampleDataLoader sampleDataLoader(){
        return new SampleDataLoader();
    }

}
