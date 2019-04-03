package test.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculator.operation.Multiplication;

public class TestMultiplication {
	@Test
	public void testGetOperator() {
		Multiplication mul = new Multiplication();
		assertEquals(mul.getOperator(),"*");
	}
	@Test
	public void testGetName() {
		Multiplication mul = new Multiplication();
		assertEquals(mul.getName(), "multiplication");
	}
	@Test
	public void testCalc() {
		Multiplication mul = new Multiplication();
		mul.setNumbers(7, 8);
		assertTrue(56 == mul.calc());
	}
}