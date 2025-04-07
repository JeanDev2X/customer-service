package com.bank.customer.service.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.customer.service.entity.Customer;

import reactor.core.publisher.Mono;
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
	Mono<Customer> findByDocumentNumber(String documentNumber);
}
