package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class fpparrayTest {

	fpparray fpa=new fpparray();
	@Test
	public void test() {
		assertEquals(fpa.isVanilla(new int[]{1}),1);
		assertEquals(fpa.isVanilla(new int[]{11, 22, 13, 34, 125}),0);
		assertEquals(fpa.isVanilla(new int[]{9, 999, 99999, -9999}),1);
		assertEquals(fpa.isVanilla(new int[]{}),1);
		assertEquals(fpa.isVanilla2(new int[]{1}),1);
		assertEquals(fpa.isVanilla2(new int[]{11, 22, 13, 34, 125}),0);
		assertEquals(fpa.isVanilla2(new int[]{9, 999, 99999, -9999}),1);
		assertEquals(fpa.isVanilla2(new int[]{}),1);
		
		assertEquals(fpa.isMaxMinEqual(new int[]{}),0);
		assertEquals(fpa.isMaxMinEqual(new int[]{2}),0);
		assertEquals(fpa.isMaxMinEqual(new int[]{1, 1, 1, 1, 1, 1}),0);
		assertEquals(fpa.isMaxMinEqual(new int[]{2, 4, 6, 8, 11}),1);
		assertEquals(fpa.isMaxMinEqual(new int[]{-2, -4, -6, -8, -11}),1);


	}
	
	

}
