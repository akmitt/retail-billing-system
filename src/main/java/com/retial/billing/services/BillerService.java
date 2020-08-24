package com.retial.billing.services;

import java.util.List;

import com.retail.billing.domain.Customer;
import com.retail.billing.domain.Item;

public interface BillerService {
   
	/** Calculate the total bill payable based on customer type and items added in cart
	 * @param customer
	 * @param items
	 * @return
	 */
	double totalBill(Customer customer, List<Item> items);

}
