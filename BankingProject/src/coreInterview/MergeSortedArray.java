package coreInterview;

public class MergeSortedArray {

	/*
	 * Merge the given 2 input sorted arrays of numbers into one . The merged
	 * array stays sorted
	 */

	public static void main(String[] args) {
		int[] a = { 9, 10, 11, 12, 13, 14, 15, 16 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] c = merge(a, b);

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + ",");
		}

	}

	private static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (a.length > i && b.length > j) {
			if (a[i] > b[j]) {
				c[k] = b[j];
				k++;
				j++;
			} else {
				c[k] = a[i];
				k++;
				i++;
			}
		}

		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}

		return c;
	}

}
