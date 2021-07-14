package Practice;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name sir! ");
		String name = in.next();
		String lastname = in.next();
		String note = "Hello Mr." + name + lastname;
		System.out.println(note);
		in.close();
		
	}

}
