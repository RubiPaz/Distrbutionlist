package Practice;

import java.util.Scanner;

public class PO08_T {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
 
		System.out.print("Enter the number of elements in the non-empty integer collection > ");

		int n = in.nextInt();

		System.out.print("Enter element(" + 1 + ") > ");

		int biggest = in.nextInt();
		
		int i = 1;
		while (i < n) {
			System.out.print("Enter element(" + (i + 1) + ") > ");
			int current = in.nextInt();
			if(current > biggest) {
				biggest = current;
			}
			i = i + 1;
		}

		String note = "The biggest is: " + biggest;

		System.out.println(note);

		in.close();
	}
		
	}


