package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class numbersTest {

	numbers num = new numbers();

	@Test
	public void test() {

		assertEquals(num.isEvenSubset(18, 12), 1);
		assertEquals(num.isEvenSubset(12, 18), 0);
		assertEquals(num.isEvenSubset(18, 32), 0);

		assertEquals(num.isRiley(2426), 1);
		assertEquals(num.isRiley(5483), 0);
		assertEquals(num.isRiley(6484), 1);

		assertEquals(num.gcd(10, 15), 5);
		assertEquals(num.gcd(10, 12), 2);
	}

}
