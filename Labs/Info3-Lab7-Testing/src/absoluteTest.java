import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class absoluteTest {
	
	static int a = Integer.MIN_VALUE +1;
	public static int absoluteValueOf (int x) {
		  if (x < -1)
		     return -x;
		  else
		     return x;
		}
	 public absoluteTest()
	    {
	    }

	    @Before
	    public void setUp()
	    {
	    }

	    @After
	    public void tearDown()
	    {
	    }
	    
	@Test
	void T01_TestZero() {
		assertEquals(0, absoluteValueOf(0));
	}
	
	@Test
	void T02_TestNegativeInteger() {
		assertEquals(1365987, absoluteValueOf(-1365987));
	}
	
	@Test
	void T03_TestPositiveInteger() {
		assertEquals(3644999, absoluteValueOf(3644999));
	}
	
	@Test
	void T04_TestPlusOne() {
		assertEquals(1, absoluteValueOf(1));
	}
	
	@Test
	void T05_TestMinusOne() {
		assertEquals(1, absoluteValueOf(-1));
	}
	@Test
	void T06_TestMaxInteger() {
		assertEquals(2147483647, absoluteValueOf(2147483647));
	}
	
	@Test
	void T07_TestMaxIntegerMinusOne() {
		assertEquals(2147483646, absoluteValueOf(2147483647-1));
	}
	
	@Test
	void T08_TestMinIntegerPlusOne() {
		assertEquals(2147483647, absoluteValueOf(-2147483648+1));
	}
	
	
	@Test
	void T09_TestMinIntegerMinusOne() {
		assertEquals(2147483647, absoluteValueOf(-2147483648-1));
	}
	
	
}
