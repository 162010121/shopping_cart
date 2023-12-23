package com.shoppingservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingservice.user.dto.CustomerDTO;
import com.shoppingservice.user.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@GetMapping("/getById/{Id}")
	public CustomerDTO getById(@PathVariable("Id") long Id)
	{
		return customerService.getById(Id);
	}

}
