package com.digitek.accessModifiers.package1;

public class Car {
	
	//instance variable
	//private modifier
	private String modelName = "Honda";
	
	//class variable
	protected static String transmission = "Auto";
	
	//default access modifier
	String engineType = "V8";
	
	//default constructor
	public Car() {
		
	}
	
	public void changeTransmission() {
		transmission = "Manual";
	}
	
	//business methods
	//private access
	private void sound() {
		System.out.println("Car honks:");
	}
	
	//business methods
	//public access
	public void drive() {
		System.out.println("Car drives:");
	}
	
	//protected access
	protected static void changeSpeed() {
		System.out.println("Parent - Car changes speed:");
	}
	
	//default access
	void changeGear() {
		System.out.println("Car changes gear:");
	}
	
	public static void main(String[] args) {

		// create an object of the car - using new Car()
		Car carUserObject = new Car();
		System.out.println("engineType:" + carUserObject.engineType);
		System.out.println("modelName:" + carUserObject.modelName);
		carUserObject.drive();
		carUserObject.sound();
		carUserObject.changeSpeed();
		carUserObject.changeGear();
		
	}
	
}
