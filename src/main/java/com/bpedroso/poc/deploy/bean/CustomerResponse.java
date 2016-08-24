package com.bpedroso.poc.deploy.bean;

import java.io.Serializable;
import java.util.List;

public class CustomerResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Customer> customer;

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(final List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerResponse [Customer=" + customer + "]";
	}

}
