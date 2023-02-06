package com.cg1.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {6,4,2,1,8};
		System.out.println("Elements before swap "+Arrays.toString(a));
		
		int l=a.length;
		
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.err.println("Elements after swap "+Arrays.toString(a));
	}
}
