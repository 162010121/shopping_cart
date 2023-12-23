package com.shoppingservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingservice.user.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
