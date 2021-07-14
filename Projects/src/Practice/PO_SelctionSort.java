package Practice;

public class PO_SelctionSort {

	public static void main(String[] args) {


		int[] arr = { 2, 4, 1, 7, 5, 3 };
		print(arr);
		selectionSort(arr);
		print(arr);
	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; ++i) {
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
}

//Exercises
// Write a program that reads from the user a set of integer numbers, sorts them, and allows the user to check if a certain number includes in the set,
//  using binary search.
	