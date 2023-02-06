package com.cg1.practice;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Howtowritedatatotextfile {
	
	
	public static void main(String[] args) throws IOException {

		FileWriter fr=new FileWriter("C:\\Z\\FileWrite.txt");
		BufferedWriter br=new BufferedWriter(fr);
		
		br.write("Welcome to coding");
		
		br.close();
	}
	
	
	

}
