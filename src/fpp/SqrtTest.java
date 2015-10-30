package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class SqrtTest {

	Sqrt sq=new Sqrt();
	@Test
	public void test() {
		assertEquals(sq.sqrt(4),2,0.001);
		assertEquals(sq.nextPerfectSquare(6),9,0.001);
		assertEquals(sq.nextPerfectSquare(36),49,0.001);
		assertEquals(sq.nextPerfectSquare(0),1,0.001);
		assertEquals(sq.nextPerfectSquare(-5),0,0.001);

	}

}
