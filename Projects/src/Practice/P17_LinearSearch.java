package Practice;

public class P17_LinearSearch {

		public static void main(String[] args) {
			
			int [] arr = {3, 1, 7, 9, 2};
			
			System.out.println(linearSearch(7, arr));
			System.out.println(linearSearch(4, arr));
		}

		public static int linearSearch(int key, int[] arr) {
			
			for (int i = 0; i < arr.length; ++i) {
				
				if (key == arr[i]) {
					
					return i;
				}
			}
			
			return -1;
		}
	}

