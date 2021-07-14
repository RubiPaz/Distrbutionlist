package Practice;

import java.util.Scanner;

public class PO05_HomeWork {

	public static void main(String[] args) {
		
   Scanner in = new Scanner (System.in);
   
   System.out.print("Enter three positive integer numbers and the program chack if the sum of x and y equals to z:   ");
	int x = in.nextInt();
	int y = in.nextInt();
	int z = in.nextInt();
	
	
	boolean isa = x + y == z;
	String note = "is " + x + " Plus " + y + " = " + z + " ? " + " Answer: "+isa;
	System.out.println(note);
	in.close();
}


// Is the sum of x and y equals to z.
   
   
	}


