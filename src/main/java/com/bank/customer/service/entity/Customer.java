package com.bank.customer.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String name;
    private String documentNumber;
    private CustomerType type;
    private CustomerProfile profile = CustomerProfile.STANDARD; // por defecto STANDARD
    private Boolean hasCreditCard; // true si tiene tarjeta de crédito
}
