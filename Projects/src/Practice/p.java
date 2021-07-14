package Practice;

public class p {
	


		public static void main(String[] args) {

			for (int i = 0; i < 10; i = i + 1) {
				
				int n = (int) (Math.random() * 100 + 1);
				
				System.out.println("Is " + n + " a prime? " + isPrime(n));
			}
		}

		public static boolean isPrime(int n) {

			boolean isPrime;

			if (n == 1) {

				isPrime = false;

			} else {

				isPrime = true;

				for (int i = 2; i <= Math.sqrt(n) && isPrime; i = i + 1) {

					if (n % i == 0) {

						isPrime = false;
					}
				}
			}

			return isPrime;
		}
	}

	// Exercises
	// Write a function that computes the the number of primes between 1 and 100.


