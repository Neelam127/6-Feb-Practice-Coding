package com.cg1.practice;

public class fibonaciseries {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10;
		int i=1;
		while(i<=count) {
			System.out.println(n1+" ");
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			i+=1;
		}
	}

}
