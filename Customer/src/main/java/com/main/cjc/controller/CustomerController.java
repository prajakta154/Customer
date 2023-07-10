package com.main.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.cjc.model.Customer;
import com.main.cjc.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService cs;
	
	@PostMapping("/savedata")
	public Customer savedata(@RequestBody Customer c) {
		return cs.savedata(c);







		
	}

}
