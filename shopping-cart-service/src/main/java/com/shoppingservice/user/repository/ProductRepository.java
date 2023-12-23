package com.shoppingservice.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoppingservice.user.entity.ProductDetails;


@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Long> {

	static final String QUERY_SELECT_ALL_DETAILS_FROM_PRODUCT = "select * from product";
	
	
	@Query(value = QUERY_SELECT_ALL_DETAILS_FROM_PRODUCT,nativeQuery = true )
	public List<ProductDetails> getAllProductsFromDatabase();

	
	
}
