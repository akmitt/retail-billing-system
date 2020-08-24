package com.retail.billing.domain;

/**
 * Product class  with code, name etc 
 * @author AkhilM
 *
 */
public class Product {
	
	private String name;
	
	private String code;
	
	private boolean applyDiscount;
	
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isApplyDiscount() {
		return applyDiscount;
	}

	public void setApplyDiscount(boolean applyDiscount) {
		this.applyDiscount = applyDiscount;
	}
}
