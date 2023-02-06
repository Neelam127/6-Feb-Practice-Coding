package com.cg1.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(30);
		set.add(20);
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
