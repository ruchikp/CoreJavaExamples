package com.digitek.abstractmodifier;

public abstract class ReportsAbstractClass {
	
	public void generateHeader() {
		System.out.println("***********HEADER**************");
	}
	
	public void subHeader() {
		System.out.println("***********SUB HEADER**************");
	}
	
	public void putLogo() {
		System.out.println("***********LOGO**************");
	}
	
	public abstract void generateBody();
	
	public void generateFooter() {
		System.out.println("***********FOOTER**************");
	}


}
