package com.digitek.operators;

public class CombinedAssignmentOperators {

	public static void main(String[] args) {
		combinedOperator1();
		combinedOperator2();
		combinedOperator3();
		combinedOperator4();
		combinedOperator5();

	}

	public static void combinedOperator1() {
		
		int x = 10;
		x += 5; // x=x+5
		System.out.println("combinedOperator1 - value of x:" + x);
	}
	
	public static void combinedOperator2() {
		
		int x = 10;
		x -= 5; // x=x-5
		System.out.println("combinedOperator2 - value of x:" + x);
	}
	
	public static void combinedOperator3() {
		
		int x = 10;
		x *= 5; // x=x*5
		System.out.println("combinedOperator3 - value of x:" + x);
	}
	
	public static void combinedOperator4() {
		
		int x = 10;
		x /= 5; // x=x/5
		System.out.println("combinedOperator4 - value of x:" + x);
	}	
	
	public static void combinedOperator5() {
		
		int x = 11;
		x %= 5; // x=x%5
		System.out.println("combinedOperator5 - value of x:" + x);
	}
	
}
