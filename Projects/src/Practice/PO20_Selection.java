package Practice;

public class PO20_Selection {
	
	public static void main (String[] args) {
		
		int []arr = {5,2,1,4,3};
		print (arr);
		isertionSort(arr);
		print(arr);
		
	}
	
	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	public static void isertionSort( int []arr) {
		
		for (int i = 1; i<arr.length; ++i) {
			insert(arr, i);
		}
	}

	private static void insert(int[] arr, int i) {
		// TODO Auto-generated method stub
		
	}

}
