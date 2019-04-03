package test.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculator.operation.Subtraction;
public class TestSubtraction {
	
	@Test
	public void testGetOperator() {
		Subtraction sub = new Subtraction();
		assertEquals(sub.getOperator(),"-");	
	}
	@Test
	public void testGetName() {
		Subtraction add = new Subtraction();
		assertEquals(add.getName(),"subtraction");
	}
	@Test
	public void testAdd() {
		Subtraction sub = new Subtraction();
		sub.setNumbers(20, 12);
		assertTrue(8 == sub.calc());	
	}
}
