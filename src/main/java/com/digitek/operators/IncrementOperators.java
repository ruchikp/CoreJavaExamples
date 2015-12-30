package com.digitek.operators;

public class IncrementOperators {

	public static void main(String[] args) {
		postIncrementOperators();
		preIncrementOperators();
		postDecrementOperators();
		preDecrementOperators();
	}

	public static void postIncrementOperators() {
		
		int x = 10;
		int y = x++;
		System.out.println("postIncrementOperators - value of y:" + y);
	}
	
	public static void preIncrementOperators() {
		
		int x = 10;
		int y = ++x;
		System.out.println("preIncrementOperators - value of y:" + y);
	}
	
	public static void postDecrementOperators() {
		
		int x = 10;
		int y = x--;
		System.out.println("postDecrementOperators - value of y:" + y);
	}
	
	public static void preDecrementOperators() {
		
		int x = 10;
		int y = --x;
		System.out.println("preDecrementOperators - value of y:" + y);
	}
	
}
