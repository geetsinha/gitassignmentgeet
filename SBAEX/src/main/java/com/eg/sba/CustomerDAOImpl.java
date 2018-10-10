package com.eg.sba;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private MongoTemplate mTemplate;
	
	@Override
	public List<Customer> getCustomer(){
	return mTemplate.findAll(Customer.class);
	
}
	@Override
	public Customer createCustomer(Customer cust) {
		
		mTemplate.save(cust);
		return cust;
		
	}

	@Override
	public Customer deleteCustomer(Customer cust) {
		
		mTemplate.remove(cust);
		return cust;
		
	}

}
