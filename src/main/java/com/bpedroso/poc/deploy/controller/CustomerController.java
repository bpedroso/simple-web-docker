package com.bpedroso.poc.deploy.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bpedroso.poc.deploy.bean.Customer;
import com.bpedroso.poc.deploy.bean.CustomerResponse;

@RequestMapping(value = "/api/customer", produces="application/json")
@RestController
public class CustomerController {

	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<CustomerResponse> getCustomers() {
        return new ResponseEntity<CustomerResponse>(new CustomerResponse(), HttpStatus.OK);
    }

	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public ResponseEntity<CustomerResponse> putCustomer(
    		@RequestParam(value="name") String id, @RequestParam(value="name") String name) {

        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setCustomer(Arrays.asList(new Customer(id, name)));

		return new ResponseEntity<CustomerResponse>(customerResponse, HttpStatus.OK);
    }
}
