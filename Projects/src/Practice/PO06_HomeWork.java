package Practice;

import java.util.Scanner;

public class PO06_HomeWork {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		

		System.out.print("Enter three integer numbers and program will print it as a reverse order: ");
		
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		String note = "The reverse order is: ";
		
			note += x + ", " + y + ", " + z +"The recerse order will be: " + z + ", " + y + ", " + x;
				
		
		System.out.println(note);
		
		in.close();
	}


// Others:
// The order of 3 numbers.

// Exercises
// Print in reverse order.
	
	// Hoping that i do understand your meaning here if not i can do it in a different way. Like
	// who is the smallest integer and show it to the user as i did today in a different practice.
	}


