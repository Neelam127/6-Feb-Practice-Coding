package com.cg1.practice;

import java.io.IOException;

class M{
	void Exception() throws IOException{
		throw new IOException("Exception is thrown");
		
	}
}

public class Exception1 {
	public static void main(String[] args) {
		M except=new M();
		try {
			except.Exception();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Finally block executed");
		}
		
	}

}
