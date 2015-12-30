package com.digitek.staticexamples;

public class StaticBlock {

	static int num;
	static String mystr;
	
	//First static block
	static {
		System.out.println("First static block");
		num=68;
		mystr = "Block1";
	}
	
	//First constructor block
	{
		System.out.println("First constructor block");
		num=68;
		mystr = "Block1";
	}
	
	public static void test() {
		System.out.println("test method");
	}
	
	//Second static block
	static {
		System.out.println("Second static block");
		num=98;
		mystr = "Block2";
	}

	
	
	public static void main(String[] args) {
		test();
	}

}
