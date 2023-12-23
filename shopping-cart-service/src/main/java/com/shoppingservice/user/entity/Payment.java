package com.shoppingservice.user.entity;

import java.sql.Date;

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
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long paymentId;

	private double amount;

	private String paymentType;

	private String paymentStatus;

	private Date PayrmentDate;

//	@OneToOne(cascade = CascadeType.ALL)
//	private Address customerAddressDetails;

}
