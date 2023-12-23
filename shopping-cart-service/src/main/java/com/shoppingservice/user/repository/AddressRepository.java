package com.shoppingservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingservice.user.entity.Address;



@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
