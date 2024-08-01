package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import interfaces.ICreditOperation;
import operations.CreditOperation;

public class TestLoanInterest {
	
	private ICreditOperation operation;

	@Before
	public void setUp() throws Exception {
		operation = new CreditOperation();
	}
	
	// Success
	@Test
	public void testLoanInterest1() {
		double result = operation.CalculateInterestToPay(200000, 4.5, 240);
		double expected = 1265.2987;
		
		assertEquals(expected, result, 0.0001);
	}
	
	// Failure
	@Test
	public void testLoanInterest2() {
		double result = operation.CalculateInterestToPay(200000, 4.5, 240);
		double expected = 1265.2987;
		
		assertEquals(expected, result, 0.00001);
	}
	
}
