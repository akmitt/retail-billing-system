package com.retial.billing.services;

import java.util.List;

import com.retail.billing.domain.Customer;
import com.retail.billing.domain.CustomerType;
import com.retail.billing.domain.Item;

public class BillerServiceImpl implements BillerService {

	private static final int DISCOUNT_PER_HUNDRED = 5;

	public double totalBill(Customer customer, List<Item> items) {
		double totalDiscountedPrice = 0;
		double discountPercentage = getDiscountPercentageForCustomer(customer);
		for (Item item : items) {
			totalDiscountedPrice = totalDiscountedPrice + item.getDiscountedPrice(discountPercentage);
		}

		return Math.round(totalDiscountedPrice - getDiscountBasedOnTotalAmount(totalDiscountedPrice));
	}

	/**
	 * This method gives the percentage of discount the customer should get based on
	 * type of customer
	 * 
	 * @param customer
	 * @return
	 */
	private double getDiscountPercentageForCustomer(Customer customer) {
		CustomerType customerType = customer.getCustomerType();
		if (customerType == CustomerType.AFFILIATE || customerType == CustomerType.EMPLOYEE
				|| customer.isAvailableForLoyaltyDiscount()) {
			return customerType.getDiscountPercentage();
		}
		return 0;
	}

	/**
	 * This method gives the discount based on billing for per 100
	 * 
	 * @param totalDiscountedPrice
	 * @return
	 */
	private double getDiscountBasedOnTotalAmount(double price) {
		return Math.floor(price / 100) * DISCOUNT_PER_HUNDRED;
	}
}
