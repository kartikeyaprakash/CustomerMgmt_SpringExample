package com.cg.customerapp.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.customerapp.entities.Customer;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {

	private Map<Long, Customer> store = new HashMap<>();
	private long generatedId;

	Long generateId() {
		++generatedId;
		return generatedId;
	}
	@Override
	public Customer add(Customer customer) {
		Long  id = generateId();
		customer.setId(id);
		store.put(id, customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		Long  id = customer.getId();
		store.put(id, customer);
		return customer;
	}
	
	@Override
	public Customer findById(Long id) {
		return store.get(id);
	}

}
