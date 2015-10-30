package fpp;

public class fpparray {

	/**
	 * Page 17 Q2 An array is called vanilla if all its elements are made up of
	 * the same digit. For example {1, 1, 11, 1111, 1111111} is a vanilla array
	 * because all its elements use only the digit 1. However, the array {11,
	 * 101, 1111, 11111} is not a vanilla array because its elements use the
	 * digits 0 and 1. Write a method called isVanilla that returns 1 if its
	 * argument is a vanilla array. Otherwise it returns 0.
	 * 
	 * @param a
	 * @return
	 */
	public int isVanilla(int[] a) {
		for (int i = 0; i < a.length; i++) {

			int digit1 = a[i] % 10;
			while (a[i] > 0) {
				int digit2 = a[i] % 10;
				if (digit1 != digit2)
					return 0;
				a[i] = a[i] / 10;

			}
		}
		return 1;
	}

	/**
	 * 
	 * @param a
	 * @return
	 */
	public int isVanilla2(int[] a) {
		if (a.length > 0) {
			for (int x = 0; x < a.length; x++) {
				int cNum = a[x];
				int num = cNum % 10;

				while (cNum > 0) {
					int rX = cNum % 10;

					if (rX != num) {
						return 0;
					}
					cNum = cNum / 10;
				}

			}
		}
		return 1;

	}

	/**
	 * Last page q 3 An array is defined to be maxmin equal if it contains at
	 * least two different elements and the number of times the maximum value
	 * occur is the same as the number of times the minimum value occur. So {11,
	 * 4, 9, 11, 8, 5 , 4, 10} is maxmin equal, because the max value 11 and min
	 * value 4 both appear two times in the array.
	 * 
	 * @param ar
	 * @return
	 */
	public int isMaxMinEqual(int[] ar) {

		if (ar.length <= 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxcount = 0;
		int mincount = 0;

		for (int x = 0; x < ar.length; x++) {
			if (ar[x] > max) {
				max = ar[x];
				maxcount = 1;
			} else if (ar[x] == max) {
				maxcount++;
			}

			if (ar[x] < min) {
				min = ar[x];
				mincount = 1;
			} else if (ar[x] == min) {
				mincount++;
			}
		}

		return mincount == maxcount ? max != min ? 1 : 0 : 0;

	}

	/**
	 * Page 93 Q3 . A balanced array is defined to be an array where for every
	 * value n in the array, -n also is in the array. For example {-2, 3, 2, -3}
	 * is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because
	 * 5 is not in the array.
	 * 
	 * @param arr
	 * @return
	 */

	public int isBalanced(int[] arr) {
		if (arr.length <= 0)
			return 0;
		int isBalanced = 1;
		boolean found = false;
		for (int x = 0; x < arr.length; x++) {
			found = false;

			for (int y = 0; y < arr.length; y++) {
				if (arr[x] == (arr[y] * -1)) {
					found = true;
					break;
				}

			}
			if (!found) {
				isBalanced = 0;
			}

		}

		return isBalanced;
	}

	/**
	 * . A twinoid is defined to be an array that has exactly two even values
	 * that are adjacent to one another. For example {3, 3, 2, 6, 7} is a
	 * twinoid array because it has exactly two even values (2 and 6) and they
	 * are adjacent to one another. The following arrays are not twinoid arrays.
	 */
	public int isTwinoid(int[] arr) {
		if (arr.length <= 0)
			return 0;
		int evenCount = 0;
		int fA = -1;
		int adj = 0;

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] % 2 == 0) {
				if (fA == -1) {
					fA = x;
				} else {
					if (fA + 1 == x) {
						adj = 1;
					} else {
						adj = 0;
						fA = x;
					}
				}

				evenCount++;
			}
		}
		return evenCount == 2 && adj == 1 ? 1 : 0;
	}

	// by yubraj (Notch4)
	public static int isTwinoidNotch(int[] a) {
		int countEven = 0;
		int result = 0;
		if (a.length > 1) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					countEven++;
				}
			}
		} else
			return 0;

		// System.out.println("Total Even : " + countEven);

		if (countEven == 2) {
			System.out.println("it has two");
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] % 2 == 0) {
					if (a[j + 1] % 2 == 0) {
						result = 1;
						break;
					} else
						result = 0;
				}
			}
		} else
			result = 0;

		if (result == 1)
			return 1;
		else
			return 0;
	}

	/**
	 * Page 92 Q2 Write a function named lastEven that returns the index of the
	 * last even value in its array argument. For example, lastEven will return
	 * 3 if the array is {3, 2, 5, 6, 7}, because that is the index of 6 which
	 * is the last even value in the array
	 */

	public int lastEven(int[] arr) {
		int lE = -1;
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] % 2 == 0) {
				lE = x;
			}
		}
		return lE;
	}

}
