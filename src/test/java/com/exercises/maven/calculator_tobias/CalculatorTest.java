package com.exercises.maven.calculator_tobias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	@Test
	public void testAddition() {
		assertEquals(calculator.addition(4, 4), 8, 0);
	}
	@Test
	public void testSubtraction() {
		assertEquals(calculator.subtraction(5, 4), 1, 0);
	}
	@Test
	public void testMultiplication() {
		assertEquals(calculator.multiplication(4, 4), 16, 0);
	}
	@Test
	public void testDivision() {
		assertEquals(calculator.division(10, 2), 5, 0);
	}

}
