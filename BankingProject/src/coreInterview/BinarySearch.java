package coreInterview;

class BinarySearch {
	public static void main(String args[]) {
		int first, last, middle, n, search = 31;

		int[] array = { 10, 20, 30, 40, 50, 60, 71, 80, 90, 95};

		n = array.length;

		first = 0;
		last = n - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " is not present in the list.\n");
	}
}