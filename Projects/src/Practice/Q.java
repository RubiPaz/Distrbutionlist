package Practice;

class Link {

	private int value;

	private Link next;

	public Link(int value, Link next) {

		this.value = value;

		this.next = next;

	}

	public int maxNegative() {

		int ans = 0;

		for (Link p = this; p != null; p = p.next) {

			if (p.value < 0 && (ans == 0 || p.value > ans)) {

				ans = p.value;

			}

		}

		return ans;

	}

}

public class Q {

	public static void main(String[] args) {

		int[] arr = { 3, -2, 7, 2, -3, -7 };

		Link list = null;

		for (int i = 0; i < arr.length; ++i) {

			list = new Link(arr[i], list);

		}

		System.out.println(list.maxNegative()); // -2

	}

}