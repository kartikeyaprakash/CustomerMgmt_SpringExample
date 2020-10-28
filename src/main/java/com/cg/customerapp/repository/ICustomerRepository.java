package com.cg.customerapp.repository;

import com.cg.customerapp.entities.Customer;

public interface ICustomerRepository {
	public Customer add(Customer customer);
	public Customer update(Customer customer);
	public Customer findById(Long id);
}
