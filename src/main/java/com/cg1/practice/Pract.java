package com.cg1.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Pract {
	
	public static void main(String[] args) {
		String S1="bat";
	String S2="ca";
		
		
	char arr1[]=S1.toCharArray();
    char arr2[]=S2.toCharArray();
    Arrays.sort(arr1);
    System.out.println(arr1);
    
    int len=0;
    int len2=0;
    String output="";
    System.out.println(arr1.length+" "+arr2.length);
    
    if(arr1.length==arr2.length){
        len=arr1.length;
        len2=arr1.length;
        for(int i=0;i<arr1.length;i++){
        	System.out.println(output);
            output=output+arr1[i]+arr2[i];
        }
        System.out.println(output);
    }
    else if(arr1.length>arr2.length){
        len=arr2.length;
        len2=arr1.length;
        
        for(int i=0;i<arr2.length;i++){
            output=output+arr1[i]+arr2[i];
            
        }
        for(int i=len;i<arr1.length;i++){
            output=output+arr1[i];
        }
       
    }
    else{
        len=arr1.length;
        len2=arr1.length;
        
        for(int i=0;i<arr1.length;i++){
            output=output+arr1[i]+arr2[i];
        }
        for(int i=len;i<arr2.length;i++){
            output=output+arr2[i];
            
        }
        
    }
    System.out.println(3/2);
   }

	}

	
