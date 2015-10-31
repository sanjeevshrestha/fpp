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

	/**
	 * Page 90 Q3 A Bean array is defined to be an array where for every value n
	 * in the array, there is also an element n­-1 or n+1 in the array. For
	 * example, {2, 10, 9, 3} is a Bean array because 2 = 3­-1 10 = 9+1 3 = 2 +
	 * 1 9 = 10-­1 Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1}
	 * and {0, ­1, 1}. The array {3, 4, 5, 7} is not a Bean array because of the
	 * value 7 which requires that the array contains either the value 6 (7­1)
	 * or 8 (7+1) but neither of these values are in the array. Write a function
	 * named isBean that returns 1 if its array argument is a Bean array.
	 * Otherwise it returns a 0.
	 */

	public int isBean(int[] arr) {
		if (arr.length <= 0)
			return 0;
		boolean found = false;
		for (int x = 0; x < arr.length; x++) {
			found = false;
			for (int y = 0; y < arr.length; y++) {
				if (arr[x] + 1 == arr[y] || arr[x] - 1 == arr[y]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}
		}

		return 1;
	}

	/**
	 * Page 94 Q 3 Define an array to be a 121 array if all its elements are
	 * either 1 or 2 and it begins with one or more 1s followed by a one or more
	 * 2s and then ends with the same number of 1s that it begins with. Write a
	 * method named is121Array that returns 1 if its array argument is a 121
	 * array, otherwise, it returns 0.
	 */

	public int is121Array(int[] arr) {
		int n = arr.length;
		int found2 = 0;

		for (int x = 0; x <= n / 2; x++) {
			if ((arr[x] != 1 && arr[x] != 2) || (x == 0 && arr[x] != 1) || (x == n / 2 && arr[x] != 2)
					|| (arr[x] != arr[n - x - 1]) || (arr[x] == 1 && found2 == 1)) {
				return 0;
			}
			if (arr[x] == 2) {
				found2 = 1;
			}
		}

		return 1;
	}

	/**
	 * Page 36 Q1 An array is called systematically increasing if it consists of
	 * increasing sequences of the numbers from 1 to n. The first six (there are
	 * over 65,000 of them) systematically increasing arrays are: {1} {1, 1, 2}
	 * {1, 1, 2, 1, 2, 3} {1, 1, 2, 1, 2, 3, 1, 2, 3, 4} {1, 1, 2, 1, 2, 3, 1,
	 * 2, 3, 4, 1, 2, 3, 4, 5} {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1,
	 * 2, 3, 4, 5, 6} Write a function named isSystematicallyIncreasing which
	 * returns 1 if its array argument is systematically increasing. Otherwise
	 * it returns 0
	 */

	public int isSystematicallyIncreasing(int[] arr) {
		if (arr[0] != 1)
			return 0;
		int count = 1;
		int pNum = 0;
		for (int x = 0; x < arr.length; x++) {

			int val = arr[x];
			if (arr[x] != pNum + 1) {
				return 0;

			} else {
				pNum++;
				if (pNum >= count) {
					pNum = 0;
					count++;
				}
			}

		}
		return 1;
	}

	/**
	 * Write a function named eval that returns the value of the polynomial a n
	 * x n + a n-1 x n-1 + ... + a 1 x 1 + a 0 .
	 */

	public double eval(double x, int[] a) {

		double sum = 0;
		for (int y = a.length - 1; y >= 0; y--) {
			double expVal = 1;
			for (int z = 0; z < y; z++) {
				expVal = expVal * x;
			}
			sum += a[y] * expVal;
		}

		return sum;

	}

	/**
	 * Page 89 Q2 A Meera array is an array that contains the value 0 if and
	 * only if it contains a prime number. The array {7, 6, 0, 10, 1} is a Meera
	 * array because it contains a prime number (7) and also contains a 0. The
	 * array {6, 10, 1} is a Meera array because it contains no prime number and
	 * also contains no 0.The array {7, 6, 10} is not a Meera array because it
	 * contains a prime number (7) but does not contain a 0. The array {6, 10,
	 * 0} is not a Meera array because it contains a 0 but does not contain a
	 * prime number. It is okay if a Meera array contains more than one value 0
	 * and more than one prime, so the array {3, 7, 0, 8, 0, 5} is a Meera array
	 * (3, 5 and 7 are the primes and there are two zeros.). Write a function
	 * named isMeera that returns 1 if its array argument is a Meera array and
	 * returns 0 otherwise.
	 */

	public int isMeera(int[] arr) {
		int hasPrime = 0;
		int hasZero = 0;

		primes prm = new primes();

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 0) {
				hasZero = 1;
			}
			if (prm.isPrime(arr[x]) == 1) {
				hasPrime = 1;
			}
		}

		return 1;
	}

	/**
	 * 
	 * Second Largest element in array
	 * 
	 * @param arr
	 * @return
	 */

	public int secondLargest(int[] arr) {
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > largest) {
				secondLargest = largest;
				largest = arr[x];
			} else if (arr[x] > secondLargest) {
				secondLargest = arr[x];
			}
		}
		return secondLargest;
	}

}
