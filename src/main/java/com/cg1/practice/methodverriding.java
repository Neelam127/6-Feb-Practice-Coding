package com.cg1.practice;
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class methodverriding extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		
		methodverriding mth=new methodverriding();
		mth.run();
		
	}

}
