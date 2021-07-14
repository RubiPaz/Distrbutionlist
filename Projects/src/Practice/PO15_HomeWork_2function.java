package Practice;

public class PO15_HomeWork_2function {

	public static void main(String[] args) {
	

	int count = 0;

	for (int i = 0; i < 1000; i++) {
 		int m = (int) (Math.random() * 99 + 1);
		int n = (int) (Math.random() * 99 + 1);
		int HAS = gcd(m, n);
		if (PrimeNum(HAS)) {
			count++;
		}
	}
	double C = count / 1000.00;
	System.out.print("Our chance is : " + C+" %");
}

public static int gcd(int m, int n) {

	while (m % n != 0) {
		int mod = m % n;
		m = n;
		n = mod;
	}

	return n;
}

public static boolean PrimeNum(int num) {
	boolean result = true;
	if (num == 1) {

		result = false;

	} else {

		result = true;

		for (int i = 2; i < num ; i++) {

			if (num % i == 0) {

				result = false;
			}
		}
	}
	return result;
}

	}
// Exercises
// Write a function that runs the above gcd function thousand times and computes the
//    chance that the gcd of two randomly chosen pair of numbers between 1 - 100 is a prime number.


