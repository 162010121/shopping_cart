package com.shoppingservice.user.service;

import java.util.List;

import com.shoppingservice.user.entity.User;
import com.shoppingservice.user.payload.OrderListDTO;
import com.shoppingservice.user.payload.OrderResponceDTO;
import com.shoppingservice.user.payload.Responce;

public interface UserService {
	
	
	public OrderResponceDTO  saveCustomer(User   user);
	
	public List<User> getAllProduct();
	
	public User getById(long Id);
	
	public OrderListDTO getAllCustomerOrders();
	
	//public OrderResponceDTO getByCustomerId(long customerId);
	
	public Responce getAllOrders();

	
	
	
	

}
