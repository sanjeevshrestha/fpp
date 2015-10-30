package fpp;

public class count {

	/**
	 * Page 92 Q3 Write a function named countMax that returns the number of
	 * times that the max value occurs in the array. For example, countMax would
	 * return 2 if the array is {6. 3, 1, 3, 4, 3, 6, 5}because 6 occurs 2 times
	 * in the array
	 */
	public int countMax(int[] arr) {

		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
				count = 1;
			} else if (arr[x] == max) {
				count++;
			}
		}
		return count;
	}
}
