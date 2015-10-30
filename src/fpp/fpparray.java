package fpp;

public class fpparray {

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
 * 
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
