package bank.customer.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import bank.customer.entity.Customer;
import reactor.core.publisher.Mono;
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
	Mono<Customer> findByDocumentNumber(String documentNumber);
}
