package Practice;

public class PO16_Recurence {


	public static void main(String[] args) {

		System.out.println(iterativeSum(10));
		System.out.println(recursiveSum(10));

		System.out.println(iterativeFactorial(5));
		System.out.println(recursiveFactorial(5));

		System.out.println(iterativePower2(10));
		System.out.println(recursivePower2(10));

		for (int i = 1; i <= 10; ++i) {

			System.out.print(iterativeFibonacci(i) + " ");
		}
		System.out.println();

		for (int i = 1; i <= 10; ++i) {

			System.out.print(recursiveFibonacci(i) + " ");
		}
		System.out.println();

		int LEVELS = 10;
		
		for (int n = 0; n < LEVELS; ++n) {
			
			for(int k = 0; k <= n; ++k) {
				
				System.out.print(recursiveOver(n, k) + " ");
			}
			
			System.out.println();
		}
}

	public static int iterativeSum(int n) {

		int accumulator = 0;

		for (int i = 0; i <= n; ++i) {
			accumulator += i;
		}

		return accumulator;
	}

	public static int recursiveSum(int n) {

		if (n == 0) {

			return 0;
		}

		return n + recursiveSum(n - 1);
	}

	public static int iterativeFactorial(int n) {

		int accumulator = 1;

		for (int i = 1; i <= n; ++i) {
			accumulator *= i;
		}

		return accumulator;
	}

	public static int recursiveFactorial(int n) {

		if (n == 0) {

			return 1;
		}

		return n * recursiveFactorial(n - 1);
	}

	public static int iterativePower2(int n) {

		int accumulator = 1;

		for (int i = 1; i <= n; ++i) {
			accumulator *= 2;
		}

		return accumulator;
	}

	public static int recursivePower2(int n) {

		if (n == 0) {

			return 1;
		}

		if (n % 2 == 0) {

			int temp = recursivePower2(n / 2);
			return temp * temp;
		}

		return 2 * recursivePower2(n - 1);
	}

	public static int iterativeFibonacci(int n) {

		int a = 0;
		int b = 1; // the result initiates to Fibonacci(1)

		for (int i = 1; i < n; ++i) {
			int temp = a + b;
			a = b;
			b = temp;
		}

		return b;
	}

	public static int recursiveFibonacci(int n) {

		if (n <= 2) {

			return 1;
		}

		return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}

	// n >= k >= 0

	public static int recursiveOver(int n, int k) {

		if (k == 0 || n == k) {

			return 1;
		}

		return recursiveOver(n - 1, k - 1) + recursiveOver(n - 1, k);
	}
}

//Exercises
// Write a recursive function that implements the Euclid gcd function.
// Write recursive function of the form sum(int from, int to) that computes the sum "from + (from + 1) + (from + 2) + ... + to".



	


