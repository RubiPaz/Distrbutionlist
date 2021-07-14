package Practice;

import java.util.Scanner;

public class PO12_HomeWorkB {

	
	private static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		
		int arr[] = ReadN();
		int SmallestP = SmallestPositive(arr);

		System.out.println("the smallest positive integer is: "+ SmallestP);


	}
	
	public static int[] ReadN () {
		System.out.println("Please enter N integer and at least one of them must be positive: ");
		int n = in.nextInt();
		 int arr[] = new int [n];
		 System.out.println("Please start to "+ n+" integer:");
		 for(int i = 0; i<n; ++i) {
			 int current = in.nextInt();
			 arr[i]=current;
			 
		 }
		 return arr;
		 
	}

	public static int SmallestPositive(int[] arr) {
		
		int SmallestP = arr[0];
		if (SmallestP<0) {
			SmallestP = Integer.MAX_VALUE;
		
		}
		
		for (int i = 1; i<arr.length; ++i) {
			
			if (arr[i]<SmallestP && arr[i]>0) {
				
				SmallestP = arr[i];
			}
			
			}
	
		return SmallestP;
	}
	
}


