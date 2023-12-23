package com.shoppingservice.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	private String productName;

	private String productCompany;
	
	private int quntity;


//	@OneToOne(cascade = CascadeType.ALL)
//	private Payment paymentDetails;

}
