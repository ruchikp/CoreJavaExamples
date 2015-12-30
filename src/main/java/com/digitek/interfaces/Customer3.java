package com.digitek.interfaces;

// Paypal transactions
public class Customer3 {
	
	public static void main(String[] args) {
		
		PaymentProvisioning paymentProvising = new PaymentProvisioning();
		paymentProvising.processPayment("amazon","paymentInfo");
		
	}
	

}
