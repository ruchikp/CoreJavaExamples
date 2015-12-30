package com.digitek.finalexamples;

public class FinalExample {

	//final variables
	final int no1 = 10;
	
	// non-final variable
	int no2 = 15;
	
	public void addNumbers() {
		no2= 20;
//		no1 = 40;    ---> NOT VALID. You can't reassign value to final variable
		
		
		int sum = no1+no2;
		System.out.println("Sum of numbers:" + sum);
	}
	
	public static void main(String[] args) {
		FinalExample fe = new FinalExample();
		fe.addNumbers();
	
	}

}
