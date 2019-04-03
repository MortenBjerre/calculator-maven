package test.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculator.operation.Addition;
import calculator.operation.Division;
import calculator.operation.Multiplication;
import calculator.operation.Operation;
import calculator.operation.Subtraction;

public class TestOperation {
	@Test
	public void testParseOperator() {
		assertTrue(Operation.parseOperator("-") instanceof Subtraction);
		assertFalse(Operation.parseOperator("/") instanceof Subtraction);
		
		assertTrue(Operation.parseOperator("*") instanceof Multiplication);
		assertTrue(Operation.parseOperator("+") instanceof Addition);
		assertTrue(Operation.parseOperator("/") instanceof Division);
	}
}