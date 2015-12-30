package com.digitek.polymorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {

		
		
	}
	
	
	public void sum(int no1, int no2) {
		int sum = no1+no2;
		System.out.println("sum of two int numbers:" + sum);
	}

	public void sum(int no1, int no2, int no3) {
		int sum = no1+no2+no3;
		System.out.println("sum of three int numbers:" + sum);
	}
	
	public float sum(int no1, float no2) {
		float sum = no1+no2;
		System.out.println("sum of int and float numbers:" + sum);
		return sum;
	}
	
	public void sum(float no1, int no2) {
		float sum = no1+no2;
		System.out.println("sum of float and int numbers:" + sum);
	}
	
}
