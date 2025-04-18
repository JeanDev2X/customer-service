package bank.customer.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.customer.dto.CustomerResponse;
import bank.customer.entity.Customer;
import bank.customer.entity.CustomerProfile;
import bank.customer.entity.CustomerType;
import bank.customer.repository.CustomerRepository;
import bank.customer.service.CustomerService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerRepository repository;

    @Override
    public Mono<Customer> createCustomer(Customer customer) {
    	
    	if (customer.getType() == CustomerType.PERSONAL && customer.getProfile() == CustomerProfile.PYME) {
    	    return Mono.error(new IllegalArgumentException("A personal customer cannot have PYME profile"));
    	}
    	if (customer.getType() == CustomerType.BUSINESS && customer.getProfile() == CustomerProfile.VIP) {
    	    return Mono.error(new IllegalArgumentException("A business customer cannot have VIP profile"));
    	}
    	
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
                    existingCustomer.setProfile(customer.getProfile());
                    existingCustomer.setHasCreditCard(customer.getHasCreditCard());
                    return repository.save(existingCustomer);
                });
    }

    @Override
    public Mono<Void> deleteCustomer(String id) {
        return repository.deleteById(id);
    }
    
    @Override
    public Mono<CustomerResponse> getCustomerByDocumentNumber(String documentNumber) {
    	return repository.findByDocumentNumber(documentNumber)
                .map(this::mapToResponse)
                .switchIfEmpty(Mono.error(new RuntimeException("Customer not found")));
    }
    
    private CustomerResponse mapToResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .name(customer.getName())
                .documentNumber(customer.getDocumentNumber())
                .type(customer.getType())
                .profile(customer.getProfile())
                .hasCreditCard(customer.getHasCreditCard())
                .build();
    }

}
