package Distrbutionlist_project;

import LinkedList.*;

/**
 * A distribution list of persons.
 *
 */
public class DistributionList {

	// the inner data structure
	private IList<Person> persons;

	/**
	 * Creates empty distribution list.
	 */
	public DistributionList() {
		// to complete
	persons = new LinkedList<Person>();
	}

	/**
	 * Add new person to the distribution list
	 * 
	 * @param person The new person
	 * @return True, if the new person is added. False if it is null or already
	 *         exists.
	 */
	public boolean add(Person person) {
		// to complete
		if(person == null) {
			return false;
		}
		if(persons.contains(person)) {
			return false;
		}
		persons.addFirst(person);
		return true;
	}

	/**
	 * Returns a given person if it exists, otherwise returns null.
	 * 
	 * @param person
	 * @return If the given person is found, the given person, otherwise null.
	 */
	public boolean contains(Person person) {
		// to complete
		if((persons.contains(person))){
			return true;
		}
		return false;
	}

	/**
	 * Deletes a given person.
	 * 
	 * @param person
	 * @return True, if the given person is deleted, otherwise false.
	 */
	public boolean remove(Person person) {
		// to complete
		if(persons.remove(person)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		// to complete
		if(persons == null) {
			return "DistributionList[persons={}]";
		}
		return "DistributionList[persons ="+persons+"]";
	}

	/**
	 * Returns a partial distribution list of persons with a given first name.
	 * 
	 * @param firstName
	 * @return
	 */
	public DistributionList getByFirstName(String firstName) {
		// to complete
		DistributionList  List = new DistributionList();
		
		for (Person x: persons) {
		if(x.getName().getFirstName().contentEquals(firstName)) {
			List.add(x);
		}
		}
		
		return List;
	}

	/**
	 * Returns a partial distribution list of persons with a given last name.
	 * 
	 * @param lastName
	 * @return
	 */
	public DistributionList getByLastName(String lastName) {
		// to complete
DistributionList  List = new DistributionList();
		
		for (Person x: persons) {
		if(x.getName().getLastName().contentEquals(lastName)) {
			List.add(x);
		}
		}
		
		return List;
	}

	/**
	 * Returns a partial distribution list of persons with a given name.
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @return
	 */
	public DistributionList getByFullName(String firstName, String middleName, String lastName) {
		// to complete
DistributionList  List = new DistributionList();
		
		for (Person x: persons) {
		if(x.getName().getFirstName().contentEquals(firstName)&&
				x.getName().getLastName().contentEquals(lastName)&&
				x.getName().getMiddleName().contentEquals(middleName)) {
			List.add(x);
		}
		}
		
		return List;
	}

	/**
	 * Returns a partial distribution list of persons with  middle name.
	 * 
	 * @return
	 */
	public DistributionList getIfHasMiddleName() {
		// to complete
DistributionList  List = new DistributionList();
		
		for (Person x: persons) {
		if(!(x.getName().getMiddleName().contentEquals(""))) {
			List.add(x);
		}
		}
		
		return List;
	}

	/**
	 * Returns a partial distribution list of persons with a given area code.
	 * 
	 * @param areaCode
	 * @return
	 */
	public DistributionList getByArea(String areaCode) {
		DistributionList ret = new DistributionList();
		for (Person x: persons) {
			if(x.getPhone().getAreaCode().contentEquals(areaCode)) {
				ret.add(x);
			}
			}
			
			return ret;
		}

	/**
	 * Returns a partial distribution list of persons with a phone number that contains given sequence of
	 * digits.
	 * 
	 * @param digits
	 * @return
	 */
	public DistributionList getIfNumberHasASequenceOfDigits(String digits) {
		DistributionList ret = new DistributionList();
		for (Person x: persons) {
			if(x.getPhone().fordigitSearch().contains(digits)) {
				ret.add(x);
			}
			}
			
			return ret;
		}
}

