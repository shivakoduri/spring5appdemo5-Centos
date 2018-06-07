package com.myprojects.spring5.examples.applicationdemo.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.myprojects.spring5.examples.applicationdemo.domain"})
@EnableJpaRepositories(basePackages = {"com.myprojects.spring5.examples.applicationdemo.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
