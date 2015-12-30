package com.digitek.operators;

public class AdditiveOperators {

	/*
	 * addition(+), subtraction(-), postincrement(no++), postdecrement(no--), preincrement(++no), predecrement(--no),
	 * string concatenation
	 */
	
	public static void main(String[] args) {
		postIncrement();
//		preIncrement();
//		concatenation();
	}

	public static void postIncrement() {
		
		int no1 = 5;
		System.out.println("no before post increment" + no1);
		
		int no = no1++;  
		// this is equivalent to the following lines below
		// int no = no1;
		// no1 = no1+1;
		
		System.out.println("no before post increment no: " + no);
		System.out.println("no before post increment no1: " + no1);
	}
	
	public static void preIncrement() {
		
		int no1 = 5;
		System.out.println("no before pre increment" + no1);
		int no = ++no1;
		System.out.println("no before pre increment" + no);

	}
	
	public static void concatenation() {
		
		String text = "Hello";
		int number = 10;
		
		String result = text + number;
		System.out.println("result: "+ result);
		
	}
	
	
}
