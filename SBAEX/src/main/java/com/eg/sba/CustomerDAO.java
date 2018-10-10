package com.eg.sba;

import java.util.List;

public interface CustomerDAO {
	
	public List<Customer> getCustomer();
	
	public Customer createCustomer(Customer cust);

}
