package com.shoppingservice.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shoppingservice.user.dto.OrderResponceDTO;

@FeignClient(value="SHOPPING-CART-SERVICE",url="http://localhost:1234")
public interface FeignCustomer {
	
	@GetMapping(value="/api/getById/{Id}")
	public OrderResponceDTO getById(@PathVariable ("Id") long Id);

}
