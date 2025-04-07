package com.bank.customer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication{ // implements CommandLineRunner
	
//	@Autowired
//	private CustomerService serviceCliente;
	
//	@Autowired
//	private TypeCustomerService serviceTipoCliente;
	
//	@Autowired
//	private ReactiveMongoTemplate mongoTemplate;
	
//	private static final Logger log = LoggerFactory.getLogger(SpringBootWebfluMsClienteApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		mongoTemplate.dropCollection("Customer").subscribe();
//		mongoTemplate.dropCollection("TypeCustomer").subscribe();
//		
//		TypeCustomer personal = new TypeCustomer("1","personal");
//		TypeCustomer empresa = new TypeCustomer("2","empresa");
//		TypeCustomer personal_vip = new TypeCustomer("3","personal_vip");
//		TypeCustomer empresa_pyme = new TypeCustomer("4","empresa_pyme");
//		
//		//
//		Flux.just(personal,empresa)
//		.flatMap(serviceTipoCliente::saveTipoCustomer)
//		.doOnNext(c -> {
//			log.info("Tipo cliente creado: " +  c.getDescripcion() + ", Id: " + c.getId());
//		}).thenMany(					
//				Flux.just(
//						new Customer("47305710","JUAN CARLOS",personal,"963791402",true,"bcp"),
//						new Customer("47305711","ESMERALDA CORP",empresa,"",true,"bcp"),
//						new Customer("47305712","LUIS RAMIREZ",personal,"963791420",true,"bcp"),
//						new Customer("47305713","ELON MOSK",personal_vip,"963791445",true,"bcp"),
//						new Customer("99091450","JOHANA RODRIGUEZ",empresa_pyme,"",true,"bcp"),
//						new Customer("99091440","KELY VILETA",empresa_pyme,"",false,"bcp"),
//						new Customer("99091499","MABEL KG",personal,"",true,"bcp")
//						)					
//					.flatMap(customer -> {
//						return serviceCliente.saveCustomer(customer);
//					})					
//				).subscribe(customer -> log.info("Insert: " + customer.getId() + " " + customer.getNombres()));
//		
//	}

}
