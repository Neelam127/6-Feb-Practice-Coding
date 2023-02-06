package com.cg1.practice;
class Employee{
	float salary=9000;
}
public class Inheritance extends Employee {
	int bonus=1000;
	public static void main(String[] args) {
		Inheritance inherit=new Inheritance();
		System.out.println(inherit.salary);
	}
	

}
