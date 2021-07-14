package Practice;

import java.util.Scanner;

public class PO12_HomeWork {


		private static Scanner in = new Scanner(System.in);
		
		public static void main(String[] args) {
			
		int arr[] = Readn();
		int Smallest = Smallest(arr);
		System.out.println("The smallest is: "+Smallest);
		
		}
			public static int[] Readn() {
				System.out.println("Enter N integer and the program will compute the samllest");
				
				int n = in.nextInt();
				 int arr[] = new int[n];
				 System.out.println("please enter "+n+" integer: ");
				 
				 for (int i = 0; i<n; ++i) {
					 int current = in.nextInt();
					 arr[i] = current;
					 
			}
		return arr;
			}
			public static int Smallest(int[] arr) {
				 int Smallest = arr[0];
				 
				 for(int i =1; i<arr.length; ++i) {
					 if (Smallest<arr[i]) {
						 arr[i]=Smallest;
						 
					 }
				 }
				 return Smallest;				 
}			
		}
	
	
	
	        
	 
	        