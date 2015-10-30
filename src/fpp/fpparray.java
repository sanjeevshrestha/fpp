package fpp;

public class fpparray {

	/**
	 * Page 17 Q2
	 * An array is called vanilla if all its elements are made up of the same digit. For example {1, 1, 11, 1111, 1111111} is a vanilla array
because all its elements use only the digit 1. However, the array {11, 101, 1111, 11111} is not a vanilla array because its elements use the
digits 0 and 1. Write a method called isVanilla that returns 1 if its argument is a vanilla array. Otherwise it returns 0.
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
 * Last page q 3
 * An array is defined to be maxmin equal if it contains at least two different elements and the number of times the maximum value
occur is the same as the number of times the minimum value occur. So {11, 4, 9, 11, 8, 5 , 4, 10} is maxmin equal, because the max
value 11 and min value 4 both appear two times in the array.
 * @param ar
 * @return
 */
	public int isMaxMinEqual(int[] ar) {

		if(ar.length<=0) return 0;
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

		return mincount == maxcount ? max!=min?1:0 : 0;

	}
}
