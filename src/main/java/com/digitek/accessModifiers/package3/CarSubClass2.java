package com.digitek.accessModifiers.package3;

import com.digitek.accessModifiers.package1.Car;

public class CarSubClass2 extends Car {

	public static void main(String[] args) {

		changeSpeed();
		
	}
	
	protected static void changeSpeed() {
		System.out.println("Child - Car changes speed:");
	}
		
}
