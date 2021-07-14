package Practice;

public class PO17_HomeWork {

	public static void main(String[] args) {
		
		
		int [] arr = {3, 1, 7, 9, 7};
		
		System.out.println(linearSearch(7, arr));
		System.out.println(linearSearch(4, arr));
	}

	public static int linearSearch(int key, int[] arr) {
		
		int a = arr.length;
		while (a>0) {
			
			a = a-1;
			
			if (key == arr[a]) {
				return a;
				
			}
			
		}
		
		return -1;
	}
}
	
