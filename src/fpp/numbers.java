package fpp;

public class numbers {

	/**
	 * An integer is defined to be an even subset of another integer n if every
	 * even factor of m is also a factor of n. For example 18 is an even subset
	 * of 12 because the even factors of 18 are 2 and 6 and these are both
	 * factors of 12. But 18 is not an even subset of 32 because 6 is not a
	 * factor of 32.
	 */

	public int isEvenSubset(int m, int n) {

		for (int x = 2; x <= m / 2; x = x + 2) {
			if (m % x == 0 && n % x != 0)
				return 0;
		}

		return 1;
	}
}
