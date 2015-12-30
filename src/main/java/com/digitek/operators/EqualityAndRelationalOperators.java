package com.digitek.operators;

public class EqualityAndRelationalOperators {

	/*
	 *  Equality operators like equal to(==), not equal to (!=)
	 *  
	 *  Relational operators like >, >=, <, <=, 
	 *  All these operators return a result of boolean
	 */
	
	
	
	public static void main(String[] args) {
		equalityOperator();
		inEqualityOperator();
		greaterThan();
		greaterThanOrEqualTo();
		lessThan();
		lessThanEqualTo();
	}
	
	
	public static void equalityOperator() {
		
		int no1 = 2;
		int no2 = 2;
		
		boolean output = (no1 == no2);
		System.out.println("equalityOperator output contains:" + output);
	}
	
	public static void inEqualityOperator() {
		
		int no1 = 2;
		int no2 = 3;
		
		boolean output = (no1 != no2);
		System.out.println("inEqualityOperator output contains:" + output);
	}
	
	public static void greaterThan() {
		
		int no1 = 2;
		int no2 = 3;
		
		boolean output = no1 > no2;
		System.out.println("greaterThan output contains:" + output);
	}
	
	public static void greaterThanOrEqualTo() {
		
		int no1 = 4;
		int no2 = 3;
		
		boolean output = no1 >= no2;
		System.out.println("greaterThanOrEqualTo output contains:" + output);
	}
	
	public static void lessThan() {
		
		int no1 = 2;
		int no2 = 3;
		
		boolean output = (no1 < no2);
		System.out.println("lessThan output contains:" + output);
	}
	
	public static void lessThanEqualTo() {
		
		int no1 = 4;
		int no2 = 3;
		
		boolean output = no1 <= no2;
		System.out.println("lessThanEqualTo output contains:" + output);
	}
	

}
