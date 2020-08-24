package com.retail.billing.services;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.retail.billing.BillingSystemBuilder;
import com.retail.billing.domain.Customer;
import com.retail.billing.domain.Item;
import com.retial.billing.services.BillerServiceImpl;




/** Test Class for  Calculating amount payable
 * @author AkhilM
 *
 */
public class BillerServiceImplTest {
	
	private BillerServiceImpl billerServiceImpl;
	private List<Item> items;
	
	@Before
	public void setUp() {
		billerServiceImpl= new BillerServiceImpl();
		items = BillingSystemBuilder.getItemListWithMultipleProducts();
	}
	
	@Test
	public void shouldCalculateBillForDiscountEligibleCustomer() {
		Customer customer = BillingSystemBuilder.getCustomerWithMoreThanTwoYearOldRegistration();
		Assert.assertEquals(761.00, billerServiceImpl.totalBill(customer, items), 0);
	}
	
	@Test
	public void shouldCalculateBillForNonEligibleCustomer() {
		Customer customer = BillingSystemBuilder.getCustomerWithLessThanTwoYearOldRegistration();
		Assert.assertEquals(790.00, billerServiceImpl.totalBill(customer, items), 0);
	}
	
	@Test
	public void shouldCalculateBillforAffiliateCustomer() {
		Customer affiliateCustomer = BillingSystemBuilder.getAffiliateCustomer();
		Assert.assertEquals(737.00, billerServiceImpl.totalBill(affiliateCustomer, items), 0);
	}
	
	@Test
	public void shouldCalculateBillForEmployeeCustomer() {
		Customer employeeCustomer = BillingSystemBuilder.getEmployeeCustomer();
		Assert.assertEquals(626.00, billerServiceImpl.totalBill(employeeCustomer, items), 0);
	}
}
