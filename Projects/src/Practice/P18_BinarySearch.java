package Practice;

public class P18_BinarySearch {


	public static void main(String[] args) {

		int[] arr = { 3, 1, 7, 9, 2 };

		System.out.println(binarySearch(7, arr));
		System.out.println(binarySearch(4, arr));
	}

	public static int binarySearch(int key, int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {

			int middle = (left + right) / 2;

			if (key == arr[middle]) {
				return middle;
			}

			if (key < arr[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		
		return -1;
	}
}

