package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class countTest {

	count cnt=new count();
	@Test
	public void test() {
		assertEquals(cnt.countMax(new int[]{6,3,1, 3, 4, 3, 6, 5}),2);
		assertEquals(cnt.countMax(new int[]{4,8,4,7,7,9,2,9,8,7,9,8,5,8}),3);
	}

}
