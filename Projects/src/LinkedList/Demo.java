package LinkedList;

public class Demo {

	public static void main(String[] args) {

		IList<Integer> list = new LinkedList<>();
		System.out.println(list);
		System.out.println(list.length());
		System.out.println(list.isEmpty());
		for (int i = 0; i < 10; ++i) {
			list.addLast(i);
			System.out.print("(" + i + ")");
		}
		System.out.println();

		for (Integer x : list) {
			System.out.print("(" + x + ")");
		}
		System.out.println();

		System.out.println(list.length());
		System.out.println(list.isEmpty());
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.length());
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println(list.length());
		System.out.println(list.remove(4));
		System.out.println(list);
		System.out.println(list.length());
		for (int i = 0; i > -5; --i) {
			list.addFirst(i);
			System.out.println(list);
		}
		System.out.println(list.length());
		for (int i = -5; i <= 5; ++i)
			System.out.println(i + ": " + list.contains(i));
		for (Integer element : list) {
			System.out.print("(" + element + ")");
		}
		System.out.println();
		list.clear();
		System.out.println(list);
	}

}
