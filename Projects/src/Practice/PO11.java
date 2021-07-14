package Practice;

import java.util.Scanner;

public class PO11 {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		 
		 System.out.println(" Enter natural numbers x and y ");
		
		 
		 int X = in.nextInt();
		 int Y = in.nextInt();
		 
	boolean divisor = divisorchack(X, Y);
	
	System.out.println("are "+X+"is divisor of"+Y+" ?"+divisor);
	}
	
	public static boolean divisorchack(int X, int Y) {
		
		if(X%Y==0) {
			return true;
		}
		else {
			return false;
		}
	}
			 	 
	}
	

