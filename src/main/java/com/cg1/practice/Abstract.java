package com.cg1.practice;

abstract class Abst {
	abstract void run();

}

class Abstract extends Abst{

	@Override
	void run() {
		System.out.println("This is implemented abstract method");
		
	}
	public static void main(String[] args) {
		Abstract ab=new Abstract();
		ab.run();
	}
	
	
}
