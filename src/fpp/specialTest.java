package fpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class specialTest {

	special sp=new special();
	@Test
	public void test() {
		assertEquals(sp.fibo(0),0);
		assertEquals(sp.fibo(1),1);
		assertEquals(sp.fibo(2),1);
		assertEquals(sp.fibo(3),2);
		assertEquals(sp.fibo(4),3);		
		assertEquals(sp.fibo(5),5);
		assertEquals(sp.fibo(6),8);
		assertEquals(sp.fibo(7),13);
		assertEquals(sp.fibo(8),21);
		assertEquals(sp.fibo(9),34);
		assertEquals(sp.fibo(10),55);
		
		
		assertEquals(sp.fibo2(0),0);
		assertEquals(sp.fibo2(1),1);
		assertEquals(sp.fibo2(2),1);
		assertEquals(sp.fibo2(3),2);
		assertEquals(sp.fibo2(4),3);		
		assertEquals(sp.fibo2(5),5);
		assertEquals(sp.fibo2(6),8);
		assertEquals(sp.fibo2(7),13);
		assertEquals(sp.fibo2(8),21);
		assertEquals(sp.fibo2(9),34);
		assertEquals(sp.fibo2(10),55);
		
		int [] x=sp.solve10();
		for(int y:x)
		{
			System.out.println(y);
		}

		
	}

}
