package com.bank.customer.service.dto;

import com.bank.customer.service.entity.CustomerProfile;
import com.bank.customer.service.entity.CustomerType;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponse {
	private String id;
    private String name;
    private String documentNumber;
    private CustomerType type;
    private CustomerProfile profile;
    private Boolean hasCreditCard;
}
