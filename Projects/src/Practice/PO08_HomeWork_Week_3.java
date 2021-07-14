package Practice;

import java.util.Scanner;

public class PO08_HomeWork_Week_3 {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner (System.in);
		
		// 1
		/*
		System.out.print("Enter N integer numbers and the program will compute the smallest number between them: ");
	

		int N = in.nextInt();
		
		System.out.print("Enter number "+ "(1)"+" from your "+N+" series: ");

		int smallest = in.nextInt();
		
		int i = 1;
		
		while (i < N) {
			System.out.print("Enter number ("+(i+1)+") from your "+N+" series: ");
			int current = in.nextInt();
			if(current < smallest) {
				smallest = current;
			}

	   	i = i+1;
		}
		String note = "The smallest number is: "+ smallest;
		System.out.println(note);
		
		in.close();
	
	}
}

	*/	
	
		
		System.out.print("Enter N integer numbers and the program will compute the smallest positive number between them: ");
	      
		int N = in.nextInt();
		
		System.out.print("Enter number "+ "(1)"+" from your "+N+" series: ");
		
		int x = in.nextInt();
		
		int smallestP = Integer.MAX_VALUE;
		
		if (x > 0 && x < smallestP) {
			smallestP = x;
		}
		
		int i = 0;
		
		while (i<N-1) {
			int current = in.nextInt();
			if (current>0 && current<smallestP) {
				smallestP = current;
			}
			i++;
		}
		int max = Integer.MAX_VALUE;
			if (smallestP<max) {
				System.out.println("The smallest positive number is: "+smallestP );
			}
			else {
				System.out.println(" at least one of your number must be positive. Try again to run the program");
			}
			
		
		in.close();
		
	}
	}
     
 		 
		
		
		
		