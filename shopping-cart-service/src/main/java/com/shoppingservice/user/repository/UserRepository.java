package com.shoppingservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingservice.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

	
//	static final String QUERY_TO_GET_CUSTOMERDETAILSBYID = 
//			"select * from customer where customerId =: customerId";
//
////	@Query(value = QUERY_TO_GET_ALLCUSTOMERS, nativeQuery = true)
////	List<OrderResponceDTO> getAllOrders();
//	
//	@Query(value = QUERY_TO_GET_CUSTOMERDETAILSBYID, nativeQuery = true)
//	public OrderResponceDTO findByCustomerId(@Param("customerId")    long customerId);

}
