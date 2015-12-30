package com.digitek.operators;

public class ConditionalOperators {

	/*
	 * Conditional Operators aka short circuit operators
	 * AND (&&), OR (||), ternary (?:)
	 */
	
	
	public static void main(String[] args) {
//		operatorAND();
//		operatorOR();
		ternaryOperator();

	}
	
	public static void operatorAND() {
		
		int no1 = 10;
		int no2 = 11;
		int no3 = 12;
		
		// && operator looks for the first false expression and gets out of the comparison check
		boolean output = compare1(no1, no2) && compare2(no2, no3);
		System.out.println("operatorAND output contains:" + output);
	}
	
	public static void operatorOR() {
		
		int no1 = 10;
		int no2 = 11;
		int no3 = 12;
		
		// || operator looks for the first true expression and gets out of the comparison check
		boolean output = compare1(no1, no2) || compare2(no2, no3);
		System.out.println("operatorAND output contains:" + output);
	}

	private static boolean compare1(int no1, int no2) {
		System.out.println("compare1()");
		return no1 < no2;
	}
	
	private static boolean compare2(int no1, int no2) {
		System.out.println("compare2()");
		return no1 < no2;
	}
	
	public static void ternaryOperator() {
		
		int no1 = 35;
		int no2 = 30;
		
		int smallestValue = (no1 < no2) ? no1 : no2;
		System.out.println("smallest value: "+ smallestValue);
	}
	
	
}
