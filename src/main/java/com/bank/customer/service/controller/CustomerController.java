package com.bank.customer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.service.dto.CustomerResponse;
import com.bank.customer.service.entity.Customer;
import com.bank.customer.service.service.CustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
    private CustomerService service;

    @PostMapping
    public Mono<Customer> create(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

    @GetMapping
    public Flux<Customer> getAll() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Mono<Customer> getById(@PathVariable String id) {
        return service.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public Mono<Customer> update(@PathVariable String id, @RequestBody Customer customer) {
        return service.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteCustomer(id);
    }
    
    @GetMapping("/document/{documentNumber}")
    public Mono<CustomerResponse> getCustomerByDocumentNumber(@PathVariable String documentNumber) {
        return service.getCustomerByDocumentNumber(documentNumber);
    }
    
}
