package com.bpedroso.poc.deploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api", produces="application/json; charset=UTF-8")
@RestController
public class CustomerController {

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String allCustomers() {
        return "customers";
    }
}
