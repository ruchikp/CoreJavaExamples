package com.digitek.interfaces;

public class ChasePaymentProcessor implements IPaymentProcessor {

	@Override
	public String processPayment(String paymentInfo) {
		System.out.println("Processing payment using Chase");
		return "processed";
	}



}
