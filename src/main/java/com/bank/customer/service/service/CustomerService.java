package com.bank.customer.service.service;


import com.bank.customer.service.entity.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CustomerService {
	Mono<Customer> createCustomer(Customer customer);
    Flux<Customer> getAllCustomers();
    Mono<Customer> getCustomerById(String id);
    Mono<Customer> updateCustomer(String id, Customer customer);
    Mono<Void> deleteCustomer(String id);
    Mono<Customer> getCustomerByDocumentNumber(String documentNumber);
}
