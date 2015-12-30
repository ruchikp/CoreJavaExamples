package com.digitek.staticexamples;

public class StaticCounter {

	// instance(object) variable. Not visible to other objects.
	int counter = 0;
	
	// class variable. This value is visible to all the objects.
	static int staticCounter = 0;
	
	public static final int STATIC_IMPORT_COUNTER = 10;
	
	
	//constructor
	StaticCounter() {
		staticCounter = staticCounter+1;
		counter = counter+1;
	}
	
	public static void incrementStaticCounter(int number) {
		int sum = number+STATIC_IMPORT_COUNTER;
		System.out.println("incrementStaticCounter::" + sum);
	}
 	
	public static void main(String[] args) {
		
		incrementStaticCounter(20);
		

		StaticCounter sc = new StaticCounter();
		System.out.println("counter value:" + sc.counter);
		System.out.println("static counter:" + staticCounter);
		
		System.out.println("***********************************");
		
		StaticCounter sc2 = new StaticCounter();
		System.out.println("counter value:"+ sc2.counter);
		System.out.println("static counter:" + staticCounter);
		staticCounter = 10;
		sc2.counter=10;
		
		
		System.out.println("***********************************");
		
		StaticCounter sc3 = new StaticCounter();
		System.out.println("counter value:"+ sc3.counter);
		System.out.println("static counter:" + staticCounter);
		
		
		
		
	}

}
