package com.projects.quickcart.buyer.dto;

import lombok.Data;

@Data
public class CheckoutForm {
	private String fullName;
	private String mobileNumber;
	private String address;
	private int pincode;
	private String paymentMode;
}
