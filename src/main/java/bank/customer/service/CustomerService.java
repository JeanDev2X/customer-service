package bank.customer.service;


import bank.customer.dto.CustomerResponse;
import bank.customer.entity.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CustomerService {
	Mono<Customer> createCustomer(Customer customer);
    Flux<Customer> getAllCustomers();
    Mono<Customer> getCustomerById(String id);
    Mono<Customer> updateCustomer(String id, Customer customer);
    Mono<Void> deleteCustomer(String id);
    Mono<CustomerResponse> getCustomerByDocumentNumber(String documentNumber);
}
