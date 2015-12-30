package com.digitek.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		performAddition();
		readLine();
//		readLines();
//		additonWithoutScanner();
	}
	
	
	private static void additonWithoutScanner() {
		
		int no1 = 5;
		int no2 = 10;
		int sum = no1+no2;
		System.out.println("result:" + sum);
		
	}
	
	// Read input from keyboard using Scanner API.
	// Scanner API is available from java.util package.
	private static void performAddition() {
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int no1 = scannerObject.nextInt();
		
		System.out.println("Enter second number");
		int no2 = scannerObject.nextInt();
		
		int sum = no1+ no2;
		System.out.println("result:" + sum);
		scannerObject.close();

	}
	
	private static void readLine() {
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Please enter a text");
		String input = scannerObject.nextLine();
				
		System.out.println("You entered:" + input);
		
		scannerObject.close();
	}
	
	private static void readLines() {
		
		Scanner scannerObject = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter a text");
			String input = scannerObject.nextLine();
			
			if(input.isEmpty()) {
				break;
			}
			System.out.println("Your text is:" + input);
		}
		
		scannerObject.close();
	}


}
