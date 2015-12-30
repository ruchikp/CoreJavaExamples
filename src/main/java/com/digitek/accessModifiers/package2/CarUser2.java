package com.digitek.accessModifiers.package2;

import com.digitek.accessModifiers.package1.Car;

public class CarUser2 {

	public static void main(String[] args) {

		// create an object of the car - using new Car()
		Car carUserObject = new Car();
//		System.out.println("engineType:" + carUserObject.engineType);
//		System.out.println("modelName:" + carUserObject.modelName);
		carUserObject.drive();
//		carUserObject.sound();
//		carUserObject.changeSpeed();
//		carUserObject.changeGear();

		
	}

}
