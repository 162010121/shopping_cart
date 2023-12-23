package com.shoppingservice.user.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingservice.user.entity.ProductDetails;
import com.shoppingservice.user.entity.User;
import com.shoppingservice.user.payload.AddressDetails;
import com.shoppingservice.user.payload.OrderListDTO;
import com.shoppingservice.user.payload.OrderResponceDTO;
import com.shoppingservice.user.payload.Payment;
import com.shoppingservice.user.payload.Product;
import com.shoppingservice.user.payload.Responce;
import com.shoppingservice.user.repository.UserRepository;
import com.shoppingservice.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	public static final String customer = "customer";

	public static final String porduct = "porduct";

//	@Autowired
//	private ProductRepository productRepository;
//
//	@Autowired
//	private UserRepository userRepository;

	@Override
	public User saveCustomer(User user) {

		// OrderResponceDTO dto = new OrderResponceDTO();

//		dto.setPaymentId(user.getPaymentId());
//		dto.setProductId(user.getProductId());	
//		dto.setAmount(user.getAmount());
//		dto.setProductCompany(user.getProductCompany());
//		dto.setProductName(user.getProductName());
//		dto.setPincode(user.getPincode());
//		dto.setPaymentStatus("Order SuccessFully Placed...!");
//		dto.setPaymentType(user.getPaymentType());
//		dto.setPayrmentDate(new Date());
//		dto.setFlatNumber(user.getFlatNumber());
//		dto.setArea(user.getArea());
//		dto.setCity(user.getCity());
//		dto.setState(user.getState());

		repository.save(user);

		return user;
	}

	@Override
	public List<User> getAllProduct() {
		return repository.findAll();
	}

	@Override
	public User getById(long Id) {

		User user = repository.findById(Id).get();

		OrderResponceDTO dto = new OrderResponceDTO();

		dto.setCustomerId(user.getCustomerId());
		dto.setEmail(user.getEmail());
		dto.setCustomerName(user.getCustomerName());
		dto.setMobileNumber(user.getMobileNumber());

		ProductDetails productDetails = new ProductDetails();

		Product product = new Product();

		dto.setProductDetails(product);

//		product.setProductId(user.getProductId());
//		product.setProductCompany(user.getProductCompany());
//		product.setProductName(user.getProductName());

		Payment payment = new Payment();
//		payment.setPaymentId(user.getPaymentId());
//		payment.setAmount(user.getAmount());
//		payment.setPaymentStatus(user.getPaymentStatus());
//		payment.setPaymentType(user.getPaymentType());
//		payment.setPayrmentDate(new Date(0));

		// AddressDetails address = new AddressDetails();
//		address.setFlatNumber(user.getFlatNumber());
//		address.setArea(user.getArea());
//		address.setCity(user.getCity());
//		address.setPincode(user.getPincode());
//		address.setState(user.getState());

		return user;
	}

	// To get the list of details counting
	public OrderListDTO getAllCustomerOrders() {
		OrderListDTO orderDTO = new OrderListDTO();

		String serch = "Praveen";

//		List<OrderResponceDTO> list=repository.getAllOrders();
//		List<OrderResponceDTO> orderList=list.stream()
//				.filter(s -> s.getUserName().equalsIgnoreCase(serch))
//				.collect(Collectors.toList());
//		
//		orderDTO.setCount(orderList.size());
//		orderDTO.setCustomerName(serch);
//		orderDTO.setCustomerOrderDetails(orderList);

		List<User> list = repository.findAll();
		List<User> ordersList = list.stream().filter(s -> s.getCustomerName().equalsIgnoreCase(serch))
				.collect(Collectors.toList());

		orderDTO.setCount(ordersList.size());
		orderDTO.setCustomerName(serch);
		orderDTO.setCustomerOrderDetails(ordersList);

		return orderDTO;

	}

	@Override
	public Responce getAllOrders() {

		// OrderResponceDTO responceDTODetails = new OrderResponceDTO();
		Responce responce = new Responce();

		Product product = new Product();
		Payment payment = new Payment();
		AddressDetails address = new AddressDetails();
		OrderResponceDTO responceDTO = new OrderResponceDTO();

		List<User> userResponce = repository.findAll();
		for (User entity : userResponce) {

			// For Customer
			responceDTO.setCustomerId(entity.getCustomerId());
			responceDTO.setCustomerName(entity.getCustomerName());
			responceDTO.setEmail(entity.getEmail());
			responceDTO.setMobileNumber(entity.getMobileNumber());

			// For Product
			product.setProductId(entity.getProductId());
			product.setProductName(entity.getProductName());
			product.setProductCompany(entity.getProductCompany());
			product.setQuntity(entity.getQuntity());

			payment.setPaymentId(entity.getPaymentId());
			payment.setAmount(entity.getAmount());
			payment.setPaymentStatus(entity.getPaymentStatus());
			payment.setPaymentType(entity.getPaymentType());
			// payment.setPayrmentDate(new LocalDate(0));

			address.setFlatNumber(entity.getFlatNumber());
			address.setArea(entity.getArea());
			address.setCity(entity.getCity());
			address.setPincode(entity.getPincode());
			address.setState(entity.getState());

		}

		responce.setOrderDetails(responceDTO);
		responceDTO.setProductDetails(product);
		responceDTO.setPaymentDetails(payment);
		responceDTO.setCustomerAddressDetails(address);
		return responce;

//		List<User> userDetails = repository.findAll();
//		List<ProductDetails> productDetails = productRepository.findAll();
//
//		orderResponceDTO.add(order);
//
//		if (!productDetails.isEmpty()) {
//			List<Product> list = new ArrayList<>();
//			for (ProductDetails entity : productDetails) {
//				Product productDTO = new Product();
//
//				productDTO.setProductId(entity.getProductId());
//				productDTO.setProductName(entity.getProductName());
//				productDTO.setProductName(entity.getProductName());
//				list.add(productDTO);
//
//			}
//
//		}

	}

}
