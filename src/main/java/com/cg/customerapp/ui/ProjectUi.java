package com.cg.customerapp.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customerapp.entities.Customer;
import com.cg.customerapp.service.ICustomerService;


@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service;

	public void run()
	{
		Customer customer = add(1L, "K");
		Customer customer1 = add(2L, "S");
		Long id1 = customer.getId();
		System.out.println("Before update: "+customer.toString());
		customer = update(id1, "P");
		System.out.println("After update: "+customer.toString());
		System.out.println(customer1.toString());
	}
	
	public Customer add(Long id, String name)
	{
		Customer customer = new Customer(id, name);
		customer = service.register(customer);
		return customer;
	}
	
	public Customer update(Long id, String newName)
	{
		return service.updateName(id, newName);
	}
	
}
