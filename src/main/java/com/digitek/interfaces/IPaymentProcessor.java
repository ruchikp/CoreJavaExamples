package com.digitek.interfaces;

public interface IPaymentProcessor {
	
	String PAYMENT_STATUS = "unprocessed"; // same as: public static final String statusOfPayment = "unprocessed"
	
	String processPayment(String paymentInfo);   // this is same as: public abstract String processPayment
	
}
