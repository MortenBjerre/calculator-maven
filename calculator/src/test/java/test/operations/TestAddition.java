package test.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculator.operation.Addition;
public class TestAddition {
	
	@Test
	public void testGetOperator() {
		Addition add = new Addition();
		assertEquals(add.getOperator(),"+");	
	}
	@Test
	public void testGetName() {
		Addition add = new Addition();
		assertEquals(add.getName(),"addition");
	}
	@Test
	public void testAdd() {
		Addition add = new Addition();
		add.setNumbers(5, 10);
		assertTrue(15 == add.calc());	
	}
}
