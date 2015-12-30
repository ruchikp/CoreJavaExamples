package com.digitek.interfaces;

public class PaypalPaymentProcessor implements IPaymentProcessor {

	@Override
	public String processPayment(String paymentInfo) {
		System.out.println("Processing payment using Paypal");
		return "processed";
	}

}
