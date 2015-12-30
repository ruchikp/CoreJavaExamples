package com.digitek.encapsulation;

public class EncapsulationClient {

	public static void main(String[] args) throws Exception {

		CustomerOrder ee = new CustomerOrder();
		ee.setCustName("Cust1");
		ee.setCustOrder("electronics");
		ee.setCustOrderQty(-10);
		
		
		System.out.println("Customer name " + ee.getCustName());
		System.out.println("Customer order " + ee.getCustOrder());
		System.out.println("Customer qty " + ee.getCustOrderQty());
		
	}

}
