package Practice;

public class PO18_HomeWork {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 6, 7, 12, 12, 12, 12,12,12,12, 13, 14 };

		System.out.println(binarySearch(12, arr));
		
	}

	public static int binarySearch(int key, int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {

			int middle = (left + right) / 2;

			if (key == arr[middle]) {
				
				while (key ==arr[middle]) {
					middle = middle+1;
					
				}
				return middle-1;
				
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
