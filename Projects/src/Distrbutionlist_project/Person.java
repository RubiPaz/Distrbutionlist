package Distrbutionlist_project;

/**
 * A person
 * 
 */
public class Person {

	// The name
	private Name name;

	// The phone number
	private Phone phone;

	

	/**
	 * Trivial constructor.
	 * 
	 * @param name
	 * @param phone
	 */
	public Person(Name name, Phone phone) {
		// to complete
		this.name = name;
		this.phone = phone;
	}

	/**
	 * Returns the name.
	 * @return
	 */
	public Name getName() {
		// to complete
		return this.name;
	}


	/**
	 * Returns the phone.
	 * @return
	 */
	public Phone getPhone() {
		// to complete
		return this.phone;
	}

	@Override
	public String toString() {
		// to complete
		return "Person Name"+" = "+name+", Phone="+phone+"]";
	}

	/**
	 * Returns true if the name and the phone are equals, otherwise returns false.
	 */
	@Override
	public boolean equals(Object x) {
		// to complete
		if(!(x instanceof Person)) {
		return false;
	}
	Person Other = (Person) x;
	return this.name.toString().equals(Other.name.toString()) && this.phone.toString().equals(Other.phone.toString());
	}
}
