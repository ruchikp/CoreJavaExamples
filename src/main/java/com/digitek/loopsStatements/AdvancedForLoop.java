package com.digitek.loopsStatements;

public class AdvancedForLoop {

	// Also called as for-each loop
	
	public static void main(String[] args) {
		enhancedForLoop();
	}
	
	public static void enhancedForLoop() {
		
		String[] months = {"Jan","Feb","Mar","Apr"};
		
		for (String month: months) {
			System.out.println("Month is:" + month);
		}
		
	}

}
