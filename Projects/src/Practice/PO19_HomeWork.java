package Practice;

public class PO19_HomeWork {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 7, 5, 3 };
		print(arr);
		selectionSort(arr);
		print(arr);
		System.out.println("The Location is:"+ binarySearch(3, arr));
	}

	public static void selectionSort(int[] arr) {

			for (int i = 0; i < arr.length ; ++i) {
			int minIdx = minIdx(arr, i);
			swap(arr, i, minIdx);
		}
		
	}

	private static int minIdx(int[] arr, int i) {

		int minIdx = i;

		for (int j = i + 1; j < arr.length; ++j) {

			if (arr[j] < arr[minIdx]) {

				minIdx = j;
			}
			
		}
		
		return minIdx;
	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; ++i) {

			System.out.print("(" + arr[i] + ")");
			
		}

		
		System.out.println();
		
		}
	
	public static int binarySearch(int key, int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {

			int middle = (left + right)/2;

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


