package com.bank.customer.service.service.impl;
import com.bank.customer.service.entity.Customer;
import com.bank.customer.service.repository.CustomerRepository;
import com.bank.customer.service.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerRepository repository;

    @Override
    public Mono<Customer> createCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Flux<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Mono<Customer> getCustomerById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Customer> updateCustomer(String id, Customer customer) {
        return repository.findById(id)
                .flatMap(existingCustomer -> {
                    existingCustomer.setName(customer.getName());
                    existingCustomer.setDocumentNumber(customer.getDocumentNumber());
                    existingCustomer.setType(customer.getType());
                    return repository.save(existingCustomer);
                });
    }

    @Override
    public Mono<Void> deleteCustomer(String id) {
        return repository.deleteById(id);
    }
    
    @Override
    public Mono<Customer> getCustomerByDocumentNumber(String documentNumber) {
        return repository.findByDocumentNumber(documentNumber);
    }

}
