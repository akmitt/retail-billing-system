package com.retail.billing;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.retail.billing.domain.Customer;
import com.retail.billing.domain.CustomerType;
import com.retail.billing.domain.Item;
import com.retail.billing.domain.Product;

public class BillingSystemBuilder {
	
	private static final int CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS = 2;
	
	public static Product getDiscountableProduct() {
		Product product = new Product();
		product.setCode("cleaning100");
		product.setName("soap");
		product.setApplyDiscount(true);
		product.setPrice(57.99);
		
		return product;
	}
	
	public static Product getNonDiscountableProduct() {
		Product product = new Product();
		product.setCode("grams100");
		product.setName("Oats");
		product.setApplyDiscount(Boolean.FALSE);
		product.setPrice(49.99);
		
		return product;
	}
	
	public static Customer getAffiliateCustomer() {
		Customer customer = new Customer(CustomerType.AFFILIATE, "test1", "test affiliate", new DateTime().minusYears(3));
		return customer;
	}
	
	public static Customer getEmployeeCustomer() {
		Customer customer = new Customer(CustomerType.EMPLOYEE, "test2", "test employee", new DateTime().minusYears(3));
		return customer;
	}
	
	public static Customer getCustomerWithMoreThanTwoYearOldRegistration() {
		Customer customer = new Customer(CustomerType.CUSTOMER, "test3", "test regular", new DateTime().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS).minusDays(1));
		return customer;
	}
	
	public static Customer getCustomerWithLessThanTwoYearOldRegistration() {
		Customer customer = new Customer(CustomerType.CUSTOMER, "test4", "test regular 1", new DateTime().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS).plusDays(1));
		return customer;
	}
	
	public static Item getItemWithDiscountableProduct(int quantity) {
		return new Item(getDiscountableProduct(), quantity);
	}
	
	public static Item getItemWithNonDiscountableProduct(int quantity) {
		return new Item(getNonDiscountableProduct(), quantity);
	}
	
	public static List<Item> getItemListWithMultipleProducts() {
		List<Item> items = new ArrayList<Item>();
		items.add(getItemWithDiscountableProduct(10));
		items.add(getItemWithNonDiscountableProduct(5));
		return items;
	}
}
