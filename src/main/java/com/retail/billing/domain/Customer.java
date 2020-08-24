package com.retail.billing.domain;

import org.joda.time.DateTime;

/** This class  defines the customer and its attributes 
 * @author AkhilM
 *
 */
public class Customer {
	
	private static final int CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS = 2;
	
	private CustomerType customerType;
	
	private String id;
	
	private String name;
	
	private DateTime registrationDate;
	
	public Customer(CustomerType customerType, String id, String name, DateTime registrationDate) {
		super();
		this.customerType = customerType;
		this.setId(id);
		this.setName(name);
		this.registrationDate = registrationDate;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	

	public DateTime getRegistrationDate() {
		return registrationDate;
	}
	
	public boolean isAvailableForLoyaltyDiscount() {
		DateTime dateToCompare = DateTime.now().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS);
		return registrationDate.isBefore(dateToCompare) && (CustomerType.CUSTOMER == customerType);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
