package com.cg1.practice;

import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of elements");
		int num=sc.nextInt();
		
		System.out.println("Enter the elements");
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search");
		int target=sc.nextInt();
		
		Boolean found=false;
		
		for(int i=0;i<num;i++) {
			if(target==arr[i]) {
				System.out.println("Element found at pos "+(i+1));
				found=true;
				break;
			}
		}
		if(found!=true) {
			System.out.println("Element not found");
		}
		
		
		
		
	}

}
