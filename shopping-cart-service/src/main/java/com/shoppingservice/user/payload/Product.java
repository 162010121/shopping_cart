package com.shoppingservice.user.payload;

import lombok.Data;

@Data

public class Product {

	private long productId;
	
	private String productName;

	private String productCompany;
	
	private int quntity;
	
//	public Product(ProductDetails  details)
//	{
//		this.setProductId(details.getProductId());
//		this.setProductCompany(details.getProductCompany());
//		this.setProductName(details.getProductName());
//		
//	}

	//private Payment paymentDetails;

}
