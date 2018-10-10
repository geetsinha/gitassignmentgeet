package com.eg.sba;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(value="/")
public class CustomerController {
	
	@Autowired
	private CustomerDAO cdao;
	
	@RequestMapping(value="/listcust" , method =RequestMethod.GET)
	public List<Customer> getCustomer() {
		return cdao.getCustomer();
		
	}
	
	/*//http://localhost:8084/create
	{
		"cname":"abcdef",
		"addr":"someaadr"
	
	}
	
	*/
	@RequestMapping(value="/create" , method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer cust)
	{
		return cdao.createCustomer(cust);
		
	}

}
