package com.cg1.practice;

interface Greet{
	abstract void greeting();
}

interface Greet2{
	abstract void greeting2();
}

public class interface1 implements Greet,Greet2{

	@Override
	public void greeting2() {
		System.out.println("Greeting 2 implemented");
		
	}

	@Override
	public void greeting() {
		System.out.println("Greeting 1 implemented");
		
	}
	
	public static void main(String[] args) {
		interface1 in=new interface1();
		in.greeting();
		in.greeting2();
		
	}

}
