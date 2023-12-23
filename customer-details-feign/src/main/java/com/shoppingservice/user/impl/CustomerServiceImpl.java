package com.shoppingservice.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingservice.user.dto.CustomerDTO;
import com.shoppingservice.user.entity.CustomerDetails;
import com.shoppingservice.user.feign.FeignCustomer;
import com.shoppingservice.user.repository.CustomerRepository;

@Service
public class CustomerServiceImpl {

	@Autowired
	private FeignCustomer feign;
	
	@Autowired
	private CustomerRepository repository;
	
	public CustomerDTO getById(long Id)
	{
		CustomerDetails customerDetails=repository.findById(Id).get();
		CustomerDTO customerDTO=new CustomerDTO(customerDetails);
		customerDTO.setCustomerOrderDetails(feign.getById(customerDetails.getCustomerId()));
		
		return customerDTO;
		
	}
}
