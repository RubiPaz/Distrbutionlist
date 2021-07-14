package Practice;

import java.util.Scanner;

public class PO10_HomeWork {

	static private Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();

		for (int i = -1; i < n - 1; ++i) {			

			if (in.nextInt() > 0) {

				System.out.println(i + 3);

			}

		}

	}

}