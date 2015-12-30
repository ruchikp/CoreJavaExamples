package com.digitek.finalexamples;

public class Dealer {

	final int noOfModels = 20;
	
	public void sellProducts() {
		
		final int countOfProducts = 10;
		System.out.println("Dealer selling products" + countOfProducts+ noOfModels);
	}
	
	public void serviceProducts() {
		System.out.println("Dealer servicing products"+ noOfModels);
		
	}
	
	public static void main(String[] args) {
		
		Dealer d = new Dealer();
//		d.developProducts();
//		d.distributeProducts();
		d.sellProducts();
		d.serviceProducts();
		
	}
	
	
}
