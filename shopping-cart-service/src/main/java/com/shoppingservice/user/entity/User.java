package com.shoppingservice.user.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;

	private String customerName;

	private String email;

	private long mobileNumber;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private ProductDetails productDetails;
//	
	
	private long productId;

	private String productName;

	private String productCompany;
	
	private int quntity;


	private long paymentId;

	private double amount;

	private String paymentType;

	private String paymentStatus;

	private LocalDate PayrmentDate;

	private String flatNumber;

	private String area;

	private String city;

	private long pincode;

	private String state;
}
