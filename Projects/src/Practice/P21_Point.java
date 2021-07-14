package Practice;

public class P21_Point {

	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		System.out.println(p1);
		System.out.println(p1.getX());

		Point p2 = new Point(3, 4);
		System.out.println(p1.equals(p2));

		Point p3 = new Point(1, 4);
		System.out.println(p1.equals(p3));

		System.out.println(p1.equals("bla bla bla"));

		Point p4 = new Point();
		System.out.println(p4);

		Point p5 = new Point(p1);
		System.out.println(p5);

		System.out.println(p1.dist(p3));
		System.out.println(p3.dist(p1));
		System.out.println(p1.dist(p5));

		System.out.println(p1.dist());
	}

}
//Exercises
//Write a class that represents a Person with two fields: the name of the person and his age. Add trivial and copy contractors, getters to the two
//fields and setter to the age, and a method that returns the stage of life of the person (as string):
//Infancy. The earliest part of childhood. It is the period from birth through age one.
//Toddler years. Occur during ages two and three and are the end of early childhood.
//Childhood. Takes place from ages four to eight.
//Puberty. The period from ages nine to thirteen, which is the beginning of adolescence.
//Older adolescence. The stage that takes place between ages fourteen and eighteen.
//Adulthood. The period from adolescence to the end of life and begins at age nineteen.
//Middle age. The period of adulthood that stretches from age thirty-one to fifty.
//Senior years, or old age. Extend from age fifty-one until the end of life.
