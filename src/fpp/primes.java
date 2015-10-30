package fpp;

public class primes {

	
	/**
	 * Prime number
	 * @param n
	 * @return
	 */
	public int isPrime(int n) {
		if (n < 1)
			return 0;
		if (n == 2)
			return 1;
		if (n > 2 && n % 2 == 0)
			return 0;

		double x, limit = n / 2;

		do {
			x = limit;
			limit = (x + (n / x)) / 2;

		} while (x - limit != 0);

		int xlimit = (int) limit;

		for (int y = 3; y <= xlimit; y += 2) {
			if (n % y == 0)
				return 0;
		}

		return 1;
	}
}
