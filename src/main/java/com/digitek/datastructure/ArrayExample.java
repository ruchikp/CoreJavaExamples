package com.digitek.datastructure;

public class ArrayExample {

	public static void main(String[] args) {
		//intArray();
		//intArrayUsingLoop();
		//printFromStringArray();
		populateArray();
	}
	
	public static void intArray() {
		
		int no1 = 5;
		int no2 = 10;
				
		int[] listOfNumbers = {5,10,15,20,25};
		
		System.out.println("No of elements in the int array: "+ listOfNumbers.length);
		
		System.out.println("1st element in the array:" + listOfNumbers[0]);
		System.out.println("2nd element in the array:" + listOfNumbers[1]);
		System.out.println("3rd element in the array:" + listOfNumbers[2]);
		System.out.println("4th element in the array:" + listOfNumbers[3]);
		System.out.println("5th element in the array:" + listOfNumbers[4]);
	}
	
	public static void intArrayUsingLoop() {
		
		int no1 = 5;
		int no2 = 10;
				
		int[] listOfNumbers = {5,10,15,20,25};
		
		System.out.println("No of elements in the int array: "+ listOfNumbers.length);
		
/*		for(int startingNumber=0; startingNumber<5; startingNumber = startingNumber+2) {
		
			System.out.println("Value of startingNumber:" + startingNumber);
			
		}*/
		
		for (int counter=0; counter<listOfNumbers.length; counter = counter+2 ) {
			
			System.out.println("Value in the array:" + listOfNumbers[counter]);
		}

	}
	
	public static void printFromStringArray() {
		
		String[] months = {"Jan","Feb","Mar","Apr","May"};
		// same as String months[] = {"Jan","Feb","Mar","Apr","May"};
		
		for(int counter=0; counter<months.length; counter++) {
			
			System.out.println("Month from array:" + months[counter]);
		}
		
	}
	
	public static void populateArray() {
		
		String[] months = new String[5];
		
		for(int counter=0; counter<months.length; counter++) {
			
			System.out.println("Month from array before population:" + months[counter]);
		}
		
		// adding values to the array
		for (int counter=0; counter<months.length; counter++) {
			months[counter] = "Added value";
			String name = "value";
		}
		
		for(int counter=0; counter<months.length; counter++) {
			
			System.out.println("Month from array after population:" + months[counter]);
		}
		
		
		
		
	}


}
