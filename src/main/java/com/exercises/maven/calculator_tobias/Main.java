package com.exercises.maven.calculator_tobias;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.addition(5, 5));
		System.out.println(calculator.subtraction(10, 5));
		System.out.println(calculator.multiplication(10, 5));
		System.out.println(calculator.division(10, 5));

	}

}
