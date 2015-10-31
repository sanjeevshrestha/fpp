package fpp;

public class special {

	public int getExponent(int n, int p) {
		if (p < 1)
			return -1;
		int exp = 0;
		return exp;
	}

	/**
	 * Fibo with recursion
	 * 
	 * @param n
	 * @return
	 */
	public int fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	/**
	 * fibo 2 without recursion
	 * 
	 * @param n
	 * @return
	 */
	public int fibo2(int n) {
		if (n < 2) {
			return n;
		} else {
			int num1 = 1;
			int num2 = 1;
			for (int i = 2; i < n; i++) {
				int temp = num2;
				num2 = num1 + num2;
				num1 = temp;

			}

			return num2;
		}

	}

	/**
	 * Page 8 Q1 It is a fact that there exist two numbers x and y such that x!
	 * + y! = 10!. Write a method named solve10 that returns the values x and y
	 * in an array. The notation n! is called n factorial and is equal to n *
	 * n-1 * n-2 * ... 2 * 1, e.g., 5! = 5*4*3*2*1 = 120.
	 * 
	 * Please be sure that the method solve10 returns an array, a, with two
	 * elements where a[0] == x, a[1] == y and x! + y! = 10!.
	 */

	public int factorial(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	public int[] solve10() {
		boolean found = false;
		int[] ret = new int[] {};

		long fac10 = factorial(10);
		int i = 1;
		while (!found) {
			i++;
			if (i > 9) {
				ret = new int[] { 0, 0 };
				break;
			}

			for (int j = 1; j < i; j++) {
				if (i != j) {
					long faci = factorial(i);
					long facj = factorial(j);
					if (faci + facj == fac10) {
						found = true;
						ret = new int[] { i, j };
						break;
					}
				}
			}
		}

		return ret;

	}

}
