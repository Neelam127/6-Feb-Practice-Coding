package com.cg1.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
