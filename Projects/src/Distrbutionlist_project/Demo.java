package Distrbutionlist_project;

public class Demo {

	public static void main(String[] args) {

		Phone phone1 = new Phone("05", 1234567);
		System.out.println(phone1); // (05)1234-567

		Phone phone2 = new Phone("05", 7654321);
		System.out.println(phone2); // (05)7654-321

		Phone phone3 = new Phone("08", 3217654);
		System.out.println(phone3); // (08)3217-654
		
		Phone phone4 = new Phone("08", 3217654);
		System.out.println(phone4); // (08)3217-654

		Name name1 = new Name("Hava", "Bat-El", "Levi");
		System.out.println(name1); // Hava Bat-El Levi

		Name name2 = new Name("Adam", "Levi");
		System.out.println(name2); // Adam Levi

		Name name3 = new Name("Hava", "Choen");
		System.out.println(name3); // Hava Choen
		
		Name name4 = new Name("Hava", "Choen");
		System.out.println(name4); // Hava Choen

		Person person1 = new Person(name1, phone1);
		System.out.println(person1); // Person [name=Hava Bat-El Levi, phone=(05)1234-567]

		Person person2 = new Person(name2, phone2);
		System.out.println(person2); // Person [name=Adam Levi, phone=(05)7654-321]

		Person person3 = new Person(name3, phone3);
		System.out.println(person3); // Person [name=Hava Choen, phone=(08)3217-654]
		
		Person person4 = new Person(name4, phone4);
		System.out.println(person4); // Person [name=Hava Choen, phone=(08)3217-654]
		
		System.out.println("Test person 4 & person 3 are the same ");
		
		System.out.println(person3.equals(person4));

		DistributionList distributionList = new DistributionList();
		System.out.println(distributionList); // DistributionList [persons={}]

		System.out.println(distributionList.add(person1)); // true
		System.out.println(distributionList.add(person1)); // false
		System.out.println(distributionList.add(person2)); // true
		System.out.println(distributionList.add(null)); // false

		System.out.println(distributionList); // DistributionList [persons={(Person [name=Adam Levi,
												// phone=(05)7654-321])(Person [name=Hava Bat-El Levi,
												// phone=(05)1234-567])}]

		System.out.println(distributionList.contains(person1)); // true
		System.out.println(distributionList.contains(person3)); // false
		System.out.println(distributionList.contains(null)); // false

		System.out.println(distributionList.remove(person1)); // true
		System.out.println(distributionList.remove(person1)); // false
		System.out.println(distributionList.remove(null)); // false

		System.out.println(distributionList.add(person1)); // true
		System.out.println(distributionList.add(person3)); // true
		
		System.out.println("Test to Person 4 (his value like person 3) ="
				+ " False not add to the list #");
		System.out.println(distributionList.add(person4)); // False
		
		System.out.println(distributionList); // DistributionList [persons={(Person [name=Adam Levi,
		// phone=(05)7654-321])(Person [name=Hava Bat-El Levi,
		// phone=(05)1234-567])}]

		DistributionList partial = distributionList.getByFirstName("Hava");

		System.out.println(partial); // DistributionList [persons={(Person [name=Hava
										// Bat-El Levi, phone=(05)1234-567])(Person
										// [name=Hava Choen, phone=(08)3217-654])}]

		System.out.println(distributionList.getByLastName("Levi")); // DistributionList [persons={(Person [name=Adam
																	// Levi, phone=(05)7654-321])(Person [name=Hava
																	// Bat-El Levi, phone=(05)1234-567])}]

		System.out.println(distributionList.getByFullName("Hava", "Bat-El", "Levi")); // DistributionList
																						// [persons={(Person [name=Hava
																						// Bat-El Levi,
																						// phone=(05)1234-567])}]

		System.out.println(distributionList.getIfHasMiddleName()); // DistributionList [persons={(Person [name=Hava
																	// Bat-El Levi, phone=(05)1234-567])}]

		System.out.println(distributionList.getByArea("05")); // DistributionList [persons={(Person [name=Adam Levi,
																// phone=(05)7654-321])(Person [name=Hava Bat-El Levi,
																// phone=(05)1234-567])}]

		System.out.println(distributionList.getIfNumberHasASequenceOfDigits("21")); // DistributionList
																					// [persons={(Person [name=Adam
																					// Levi, phone=(05)7654-321])(Person
																					// [name=Hava Choen,
																					// phone=(08)3217-654])}]
		System.out.println(distributionList.getIfNumberHasASequenceOfDigits("43"));
	}
}
