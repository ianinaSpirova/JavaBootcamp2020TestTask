package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private Calculator calc;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		calc = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testAddPositiveValue() {
		assertEquals(15, (Calculator.add(5, 10)));
		assertEquals(15, (Calculator.add(10, 5)));
	}

	//Example ->
	@Test
	public void testAddNegativeValue() {
		assertEquals(5, (Calculator.add(-5, 10)));
		assertEquals(-5, (Calculator.add(5, -10)));
	}
	@Test
	public void testSubtractPositiveValue() {
		assertEquals(-5, (Calculator.subtract(5, 10)));
		assertEquals(5, (Calculator.subtract(10, 5)));
	}
	@Test
	public void testSubtractNegativeValue() {
		assertEquals(-15, (Calculator.subtract(-5, 10)));
		assertEquals(15, (Calculator.subtract(5, -10)));
	}
	@Test
	public void testMultiplyPositiveValue() {
		assertEquals(50, (Calculator.multiply(5, 10)));
		assertEquals(50, (Calculator.multiply(10, 5)));
}
	@Test
	public void testMultiplyNegativeValue() {
		assertEquals(-50, (Calculator.multiply(-5, 10)));
		assertEquals(-50, (Calculator.multiply(5, -10)));
	}
	@Test
	public void testDividePositiveValue() {
		assertEquals(0.5, (Calculator.multiply(5, 10)));
		assertEquals(2, (Calculator.multiply(10, 5)));
	}
	@Test
	public void testDivideNegativeValue() {
		assertEquals(-2, (Calculator.multiply(-10, 5)));
		assertEquals(-2, (Calculator.multiply(10, -5)));
	}

