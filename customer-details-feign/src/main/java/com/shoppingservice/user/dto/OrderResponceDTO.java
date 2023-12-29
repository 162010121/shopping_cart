package com.shoppingservice.user.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class OrderResponceDTO {

	private long customerId;

	private double amount;
	private String userName;

	private String email;

	private long mobileNumber;

	private String productComapany;

	private String productName;

	private String status;

	private long pinCode;

	private Date orderAt;

	private String paymentType;
}
