package com.cg1.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class simplecalculatorTest {

	@Test
	void Addtest() {
		simplecalculator cal=new simplecalculator();
		assertEquals(4,cal.addition(2, 2));
	}
}
