package com.cg1.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(10, "neelam");
		map.put(100, "Meena");
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
