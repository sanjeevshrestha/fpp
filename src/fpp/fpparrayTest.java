package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class fpparrayTest {

	fpparray fpa = new fpparray();

	@Test
	public void test() {
		assertEquals(fpa.isVanilla(new int[] { 1 }), 1);
		assertEquals(fpa.isVanilla(new int[] { 11, 22, 13, 34, 125 }), 0);
		assertEquals(fpa.isVanilla(new int[] { 9, 999, 99999, -9999 }), 1);
		assertEquals(fpa.isVanilla(new int[] {}), 1);
		assertEquals(fpa.isVanilla2(new int[] { 1 }), 1);
		assertEquals(fpa.isVanilla2(new int[] { 11, 22, 13, 34, 125 }), 0);
		assertEquals(fpa.isVanilla2(new int[] { 9, 999, 99999, -9999 }), 1);
		assertEquals(fpa.isVanilla2(new int[] {}), 1);

		assertEquals(fpa.isMaxMinEqual(new int[] {}), 0);
		assertEquals(fpa.isMaxMinEqual(new int[] { 2 }), 0);
		assertEquals(fpa.isMaxMinEqual(new int[] { 1, 1, 1, 1, 1, 1 }), 0);
		assertEquals(fpa.isMaxMinEqual(new int[] { 2, 4, 6, 8, 11 }), 1);
		assertEquals(fpa.isMaxMinEqual(new int[] { -2, -4, -6, -8, -11 }), 1);

		assertEquals(fpa.isBalanced(new int[] { -2, 2, 2, 2 }), 1);
		assertEquals(fpa.isBalanced(new int[] { -2, 3, 2, -3 }), 1);
		assertEquals(fpa.isBalanced(new int[] { -5, 2, -2 }), 0);
		assertEquals(fpa.isBalanced(new int[] {}), 0);
		assertEquals(fpa.isBalanced(new int[] { 1 }), 0);

		assertEquals(fpa.isTwinoid(new int[] { 3, 3, 2, 6, 7 }), 1);
		assertEquals(fpa.isTwinoid(new int[] { 3, 3, 2, 6, 6, 7 }), 0);
		assertEquals(fpa.isTwinoid(new int[] { 3, 3, 2, 7, 6, 7 }), 0);
		assertEquals(fpa.isTwinoid(new int[] { 3, 3, 2, 6, 6, 7 }), 0);
		assertEquals(fpa.isTwinoid(new int[] { 3, 8, 5, 7, 3 }), 0);
		assertEquals(fpa.isTwinoid(new int[] { 2, 4, 5, 7, 3 }), 1);

		assertEquals(fpa.lastEven(new int[] { 2, 4, 5, 7, 3 }), 1);
		assertEquals(fpa.lastEven(new int[] { 3, 2, 5, 6, 7 }), 3);
		assertEquals(fpa.lastEven(new int[] { 1, 9, 3, 2, 5, 1, 7 }), 3);
		assertEquals(fpa.lastEven(new int[] { 1, 9, 3, 2, 5, 1, 7, 8 }), 7);

	}

}
