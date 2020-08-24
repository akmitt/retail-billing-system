package com.retail.billing.domain;

/**
 * This is the enum which defines the types of customers
 * @author AkhilM
 *
 */
public enum CustomerType {
	
	AFFILIATE(10),EMPLOYEE(30),CUSTOMER(5);
	
	private double discountPercentage;
	
	CustomerType(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}

}
