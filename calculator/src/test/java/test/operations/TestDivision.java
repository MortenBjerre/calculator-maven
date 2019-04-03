package test.operations;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculator.operation.Division;

public class TestDivision {
	@Test
	public void testGetName() {
		Division div = new Division();
		assertTrue(div.getName() == "division");
	}
	@Test
	public void testGetOperator() {
		Division div = new Division();
		assertTrue(div.getOperator() == "/");
	}
	@Test
	public void testCalc() {
		Division div = new Division();
		div.setNumbers(30, 6);
		assertTrue(5 == div.calc());
	}
}