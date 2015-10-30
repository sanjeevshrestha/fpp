package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class primesTest {

	
	primes prm=new primes();
	@Test
	public void test() {
		assertEquals(prm.isPrime(2),1);
		assertEquals(prm.isPrime(3),1);
		assertEquals(prm.isPrime(5),1);
		assertEquals(prm.isPrime(7),1);
		assertEquals(prm.isPrime(8),0);
		assertEquals(prm.isPrime(11),1);




	}

}
