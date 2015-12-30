package com.digitek.loopsStatements;

public class WhileLoopDemo {

	public static void main(String[] args) {
		printNameUsingWhile();
	}
	
	
	public static void printNameUsingWhile() {
		
		int counter=0;
		
		while(counter < 5) {
			System.out.println("printing message for the iteration:" + counter);
			counter++;
		}
	}

}
