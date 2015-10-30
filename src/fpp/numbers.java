package fpp;

public class numbers {

	/**
	 * Page 93 Q1 An integer is defined to be an even subset of another integer
	 * n if every even factor of m is also a factor of n. For example 18 is an
	 * even subset of 12 because the even factors of 18 are 2 and 6 and these
	 * are both factors of 12. But 18 is not an even subset of 32 because 6 is
	 * not a factor of 32.
	 */

	public int isEvenSubset(int m, int n) {

		for (int x = 2; x <= m / 2; x = x + 2) {
			if (m % x == 0 && n % x != 0)
				return 0;
		}

		return 1;
	}

	/**
	 * Page 91 Q1 A Riley number is an integer whose digits are all even. For
	 * example 2426 is a Riley number but 3224 is not. Write a function named
	 * isRiley that returns 1 if its integer argument is a Riley number
	 * otherwise it returns 0.
	 */

	public int isRiley(int n) {
		while (n > 0) {
			int temp = n % 10;
			if (temp % 2 != 0) {
				return 0;
			}
			n = n / 10;
		}
		return 1;
	}
}
