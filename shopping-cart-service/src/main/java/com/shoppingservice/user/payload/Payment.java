package com.shoppingservice.user.payload;

import java.time.LocalDate;

import lombok.Data;

@Data

public class Payment {

	
	private long paymentId;

	private double amount;

	private String paymentType;

	private String paymentStatus;

	private LocalDate PayrmentDate;
	
	
	//private AddressDetails customerAddressDetails;

}
