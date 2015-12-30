package com.digitek.conditionalStatements;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {
		//ifStatementExample();
		switchStatement();
	}
	

	public static void ifStatementExample() {
		
		int marks1 = 60;
		int marks2 = 21;
		
		int total = marks1+marks2;
		
		
		//Syntax
/*		if(condition) {
			// if block
			// The block gets executed if the condition is true
		} else if (condition) {
			// else if block
			// The block gets executed if the condition is true
		} else {
			// If not other condition was satisfied
		}*/
		
		
		
		if(total >= 90) 
		{
			System.out.println("Grade A, marks: " + total);
		} 
		else if(total >= 80 & total < 90) 
		{
			System.out.println("Grade B, marks: " + total);
		} 
		else if(total >= 70 & total < 80) 
		{
			System.out.println("Grade C, marks: " + total);
		} 
		else if (total >= 60 & total < 70) 
		{
			System.out.println("Grade D, marks: " + total);
		} 
		else 
		{
			System.out.println("Grade F");
		}
		
	}
	
	
	public static void switchStatement() {
		
		char paymentCard = 'D'; //D, A, M
		
		switch(paymentCard) {
		
		case 'M':
			System.out.println("You have selected mastercard for payment");
			break;
		
		case 'D':
			System.out.println("You have selected discover for payment");
			break;
		
		case 'A':
			System.out.println("You have selected Amex for payment");
			break;
			
		default:
			System.out.println("You have selected default payment - Visa");
		
		}
		
		
		
		
		
	}

}
