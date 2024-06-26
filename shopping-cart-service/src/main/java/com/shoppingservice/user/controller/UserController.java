package com.shoppingservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.shoppingcart.exception.UserNotFound;
import com.shoppingservice.user.entity.User;
import com.shoppingservice.user.payload.OrderListDTO;
import com.shoppingservice.user.payload.OrderResponceDTO;
import com.shoppingservice.user.payload.Responce;
import com.shoppingservice.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public OrderResponceDTO saveCustomer(@RequestBody User user) {

		OrderResponceDTO entity = service.saveCustomer(user);
		return entity;

	}

//	@GetMapping("/getAllCustomers")
//	public List<User> getAll() {
//		List<User> fromDb = service.getAllProduct();
//		return fromDb;
//     }
	
	@GetMapping("/getAllCustomers")
	public Responce getAll() {
		Responce fromDb = service.getAllOrders();
		return fromDb;
     }
	
     

	@GetMapping("/getById/{Id}")
	public User getById(@PathVariable("Id") long Id) {
		try {

			User user = service.getById(Id);

			return user;
		} catch (Exception e) {

			throw new UserNotFound("User Not Found");
		}
	}
	
	@GetMapping("/getAllOrders")
	public OrderListDTO getAllOrders()
	{
		return service.getAllCustomerOrders();
	}
	
//	@GetMapping("/getById/{customerId}")
//	public OrderResponceDTO getById(@PathVariable("customerId") long customerId) {
//		try {
//
//			OrderResponceDTO orderResponceDTO = service.getByCustomerId(customerId);
//
//			return orderResponceDTO;
//		} catch (Exception e) {
//
//			throw new UserNotFound("User Not Found");
//		}
//	}
//	

}
