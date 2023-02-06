package com.cg1.practice;



public class Lambda {
	
	int adder(int a,int b) {
		return a+b;
	}
	
	int adder(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Lambda add=new Lambda();
		System.out.println(add.adder(10, 20,10));
	}

}
