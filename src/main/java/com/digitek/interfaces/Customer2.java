package com.digitek.interfaces;

// Paypal transactions
public class Customer2 {
	
	public static void main(String[] args) {
		
		PaymentProvisioning paymentProvising = new PaymentProvisioning();
		paymentProvising.processPayment("apple","paymentInfo");
		
	}
	

}
