package com.exercises.maven.calculator_tobias;

public class Calculator {
	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}
	public double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}
	public double multiplication(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}
	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Division by zero?");
			return -0.123456789;
		}
		return result;
	}
}
