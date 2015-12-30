package com.digitek.interfaces;

// Paypal transactions
public class Customer1 {
	
	public static void main(String[] args) {
		
		PaymentProvisioning paymentProvising = new PaymentProvisioning();
		paymentProvising.processPayment("paypal", "paymentInfo");
		paymentProvising.processPayment("chase", "paymentInfo");
		
	}
	

}
