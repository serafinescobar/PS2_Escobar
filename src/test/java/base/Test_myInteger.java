package base;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_myInteger {
	
	public static MyInteger x;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		x = new MyInteger(15);
	}

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
	public void test() {

		
		assertEquals(x.isOdd(), true);
		
		assertEquals(x.isPrime(), false);
		
		assertEquals(x.isEven(), false);
		
		assertEquals(MyInteger.isOdd(x), true);
		
		assertEquals(MyInteger.isPrime(x), false);
		
		assertEquals(MyInteger.isEven(x), false);
		
		assertEquals(x.equals(5), false);
		
		assertEquals(x.equals(15), true);
	}

}


