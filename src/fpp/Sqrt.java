package fpp;

public class Sqrt {

	/**
	 * Page 1 Q1
	 * @param n
	 * @return
	 */
	public int nextPerfectSquare(int n) {
		if (n > 0) {

			double tmp, sqrt = n / 2;

			do {
				tmp = sqrt;
				sqrt = (tmp + (n / tmp)) / 2;

			} while (tmp - sqrt != 0);

			int rSq = (int) sqrt;
			rSq++;
			System.out.println(sqrt);

			return rSq * rSq;
		} else if (n < 0) {
			return 0;
		} else {
			return 1;
		}
	}

	
	/**
	 * Tesai ko practice :)
	 * @param n
	 * @return
	 */
	public double sqrt(int n) {
		if (n <= 0)
			return 0;
		double tmp, sq = n / 2;
		do {
			tmp = sq;
			sq = (tmp + (n / tmp)) / 2;
		} while ((tmp - sq) != 0);

		return sq;
	}

}
