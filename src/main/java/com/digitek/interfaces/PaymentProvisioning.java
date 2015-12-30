package com.digitek.interfaces;

public class PaymentProvisioning {

	public void processPayment(String paymentMethod, String paymentInfo) {
		
		if(paymentMethod.equals("paypal")) {
			IPaymentProcessor pp = new PaypalPaymentProcessor();
			pp.processPayment(paymentInfo);
		} else if(paymentMethod.equals("chase")) {
			IPaymentProcessor pp = new ChasePaymentProcessor();
			pp.processPayment(paymentInfo);
		} if(paymentMethod.equals("amazon")) {
			IPaymentProcessor pp = new AmazonPaymentProcessor();
			pp.processPayment(paymentInfo);
		}
	}

}
