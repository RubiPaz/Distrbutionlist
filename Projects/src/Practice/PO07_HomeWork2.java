package Practice;

import java.util.Scanner;

public class PO07_HomeWork2 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		
		//2
		
		 System.out.println("Enter some 3 integer that at least one of them positive: ");
		 
		 int smallestP = Integer.MAX_VALUE;
		 int Max = Integer.MAX_VALUE;
		 
	
		
		 int i = 0;
		 
		 while(i<3) {
			 int current = in.nextInt();
			 if (current>0 && current<smallestP) {
				 smallestP=current;
				
				
			 }
			 i++;
			
		 } 
		 if (smallestP < Max){
			 System.out.println("the smallest positive number is: " +smallestP);
		 }
		 
		
		 else  {
			 
			 System.out.println("at least one of your number must be positive. try again:");
			
			
			 
		 }

		
		 
		in.close();
	}
}

		
//1
/*
System.out.println("Enter some 3 integer and the program will compute the small one: ");

int smallest = in.nextInt();




int i = 0;

while(i<2) {
	 int current = in.nextInt();
	 if (current<smallest) {
		 smallest=current;
		
		
	 }
	 i++;
}

	 System.out.println("the smallest positive number is: " +smallest);




in.close();
}
}
*/
