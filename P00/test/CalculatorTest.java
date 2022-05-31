import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
	
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertEquals(expected, actual);
	}
	public void testSubstract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual,expected);
	}
	@Test
	public void testMultiply() {
//		fail("Not yet implemented");
		int a = 3;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 15;
		assertEquals (actual, expected);
	}
	@Test
	public void testDivideWith0Denominator() {
//		fail("Not yet implemented");
		int a = 100;
		int b = 0;
		try {
			Calculator cal = new Calculator();
			cal.divide(a, b);
			//if operation completes, test is not executed properly.
			fail("Expected an Illegal Exception to be thrown");
			
		}
		catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not allowed", e.getMessage());
		}
		catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
		
		
	}
	@Test
	public void testDivideWithNon0Denominator() {
//		fail("Not yet implemented");
		int a = 100;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 20;
		assertEquals(expected, actual);
	}
	
}
