package Practice;

public class PO16_HomeWorkEUCLID {

public static void main(String[] args) {
		
			
	    System.out.println(plusnum(1,5));
	
}
		public static int plusnum(int from, int to ) {
			
			if(from==to) {
				return from;
			}	
			return plusnum(from , to-1)+to;
		}
	}

		