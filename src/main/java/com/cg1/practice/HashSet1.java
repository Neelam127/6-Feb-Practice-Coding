package com.cg1.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		
		Iterator<Integer> itr=set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
