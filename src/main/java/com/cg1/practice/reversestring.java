package com.cg1.practice;

public class reversestring {

	public static void main(String[] args) {
		String s="Neelam";
		
		StringBuilder string1=new StringBuilder();
		string1.append(s);
		string1.reverse();
		 System.out.println(string1);
		
		String revString = "";
		
		 for (int i=0; i<s.length(); i++){
			char str=s.charAt(i);;
			
			revString=str+revString;
		}
		
		System.out.println(revString);
	}
}
