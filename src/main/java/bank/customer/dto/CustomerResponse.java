package bank.customer.dto;

import bank.customer.entity.CustomerProfile;
import bank.customer.entity.CustomerType;
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
