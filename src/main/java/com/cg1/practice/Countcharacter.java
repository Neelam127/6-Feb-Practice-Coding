package com.cg1.practice;

import java.util.Arrays;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Countcharacter {
	public static void main(String[] args) {
		String s="Hello World";
		
		String arr[]=s.split(" ");
		
		String reverse_string="";
		
		for(int i=0;i<arr.length;i++) {
			String reverse_word="";
			for(int j=0;j<arr[i].length();j++) {
				char ch=arr[i].charAt(j);
				reverse_word=ch+reverse_word;
				
			}
			
			reverse_string=reverse_string+reverse_word+" ";
		}
		
		System.out.println(reverse_string);
	}
}
