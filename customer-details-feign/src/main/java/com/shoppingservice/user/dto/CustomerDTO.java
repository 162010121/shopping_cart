package com.shoppingservice.user.dto;

import com.shoppingservice.user.entity.CustomerDetails;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO {
	
	private long customerId;
	
	private OrderResponceDTO customerOrderDetails;
	
	public CustomerDTO(CustomerDetails details)
	{
		this.setCustomerId(details.getCustomerId());
	}

}
