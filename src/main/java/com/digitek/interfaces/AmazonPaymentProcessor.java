package com.digitek.interfaces;

public class AmazonPaymentProcessor implements IPaymentProcessor {

	@Override
	public String processPayment(String paymentInfo) {
		System.out.println("Processing payment using Amazon");
		return "processed";
	}



}
