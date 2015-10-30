package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class numbersTest {

	numbers num=new numbers();
	@Test
	public void test() {
		
		assertEquals(num.isEvenSubset(18, 12),1);
		assertEquals(num.isEvenSubset(12, 18),0);
		assertEquals(num.isEvenSubset(18, 32),0);
		
		
	}

}
