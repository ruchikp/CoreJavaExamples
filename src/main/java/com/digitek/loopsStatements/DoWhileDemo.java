package com.digitek.loopsStatements;

public class DoWhileDemo {

	public static void main(String[] args) {
		printNameUsingDoWhile();
	}
	
	public static void printNameUsingDoWhile() {
		
		int counter =5;
		
		do {
			System.out.println("printing message for the iteration:" + counter);
			counter++;
		} while(counter <5);
	}

}
