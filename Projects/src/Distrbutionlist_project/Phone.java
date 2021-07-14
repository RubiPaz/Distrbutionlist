package Distrbutionlist_project;

/**
 * A phone number
 *
 */
public class Phone {

	// the area (like 02, 03, 05 ...)
	private String areaCode;
	
	// the number
	private int number;

	// trivial constructor
	public Phone(String areaCode, int number) {
		// to complete
		this.areaCode = areaCode;
		this.number = number;
	}
	
	// returns the area
	public String getAreaCode() {
		// to complete
		return this.areaCode;
	}
	
	// returns the number
	public int getNumber() {
		// to complete
		return this.number;
	}
	public String fordigitSearch() {
		// to complete
		return "("+areaCode+")"+number;
	}

	@Override
	public String toString() {
		// to complete
		return "("+areaCode+")"+number/1000+"-"+number%1000;
	}
}
