package Practice;

public class PO14_GCD {


	public static void main(String[] args) {

		double count = 0;
		
		
		for (int i = 0; i<1000; ++i) {
			int m = (int) (Math.random() * 99 + 1);
			int n = (int) (Math.random() * 99 + 1);
			
			if (gcd(m, n)<2) {
				count++;
			}
		}
		
		double p = count/100;
		System.out.println("The chance is: "+p+"%");
	}

	public static int gcd(int m, int n) {

		int gcd = m;

		while (m % gcd != 0 || n % gcd != 0) {
			gcd = gcd - 1;
		}

		return gcd;
	}
}
