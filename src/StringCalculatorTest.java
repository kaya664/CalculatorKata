import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import kaya.calculator.StringCalculator;

class StringCalculatorTest {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	StringCalculator sc = new StringCalculator();
	
	@Test
	void testAddWithEmptyString() {
		assertEquals(0, sc.add(""));
	}
	
	@Test
	void testAddWithTwoPositiveNumbers() {
		assertEquals(3, sc.add("1,2"));
	}
	
	@Test
	void testAddWithMoreThanTwoPositiveNumbers() {
		assertEquals(10, sc.add("1,2,3,4"));
	}
	
	@Test
	void testAddWithMoreThanTwoPositivesAndNewLineDelimeter() {
		assertEquals(11, sc.add("1,2,3\n5"));
	}
	
	@Test
	void testGetNumberListFromString() {
		assertEquals(Arrays.asList(1,-3,5,12), sc.getNumberListFromString("1,-3,5,12"));
	}
	
	@Test
	void testGetNumberListFromStringWithNewLineDelimeters() {
		assertEquals(Arrays.asList(1,-3,5,12), sc.getNumberListFromString("1,-3\n5\n12"));
	}
	
	@Test
	void testGetNumberListFromStringWithCustomDelimeter() {
		assertEquals(Arrays.asList(1,-3,5,12), sc.getNumberListFromString("//;\n1;-3;5;12"));
	}
	
	@Test
	void testGetNumberListFromStringWithNegative() {
		
	}

}
