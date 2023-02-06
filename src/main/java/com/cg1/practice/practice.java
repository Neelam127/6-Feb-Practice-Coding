package com.cg1.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


class Generic<T>{
	T t;
	
	void add(T t ) {
		this.t=t;
	}
	
	T get() {
		return this.t;
	}
	
	
	
}



public class practice {
	public static <E> void printArray(E[] Array) {
		for(E Array1:Array) {
			System.out.println(Array1);
		}
	}
	
	
	public static void main(String[] args) {
		practice pr=new practice();
		Generic<Integer> gen=new Generic<Integer>();
		gen.add(10);
		
	Integer arr[]= {10,20};
	printArray(arr);
		
	}
}
