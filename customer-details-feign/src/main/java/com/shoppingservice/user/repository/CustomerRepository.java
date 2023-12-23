package com.shoppingservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingservice.user.entity.CustomerDetails;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Long>{

}
