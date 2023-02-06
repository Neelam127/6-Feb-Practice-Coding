package com.cg1.practice;



public class ffactorial {
	static int fact(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return (n*fact(n-1));
		}
	}

	public static void main(String[] args) {
		int fact1=1,ans;
		ans=fact(3);
		System.out.println(ans);
		
		
	}
}
