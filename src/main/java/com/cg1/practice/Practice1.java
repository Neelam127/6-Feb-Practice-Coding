package com.cg1.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;

import ch.qos.logback.core.subst.Token.Type;

interface Bank5{
	abstract void withdraw(int amt);
}

public class Practice1  implements Bank5{
	
	@Override
	public void withdraw(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawed amt is "+amt);
	}
	public static void main(String[] args) throws IOException {
		 
		
		Practice1 sp=new Practice1();
		 sp.withdraw(15000);
		
	}
	
		
		
		
		
		
	}


