package com.main.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.cjc.model.Customer;
import com.main.cjc.repository.CustomerRepository;
import com.main.cjc.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository cr;

	@Override
	public Customer savedata(Customer c) {
		
		return cr.save(c);
	}

}
