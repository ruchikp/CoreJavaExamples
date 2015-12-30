package com.digitek.loopsStatements;

public class ForLoopDemo {

	public static void main(String[] args) {
//		printStringRepeatedlyOne();
		printStringRepeatedlyTwo();
	}
	
	public static void printStringRepeatedlyOne() {
		
		for(int counter=0; counter<5; counter++) {
			System.out.println("printing message for the iteration:" + counter);			
		}
	}
	
	public static void printStringRepeatedlyTwo() {
		
		for(int counter=0; counter<5; counter=counter+3) {
			System.out.println("printing message for the iteration:" + counter);			
		}
	}

}
