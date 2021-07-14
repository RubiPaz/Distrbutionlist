package LinkedList;

public interface IList<T> extends Iterable<T> {
	
	long length();
	boolean isEmpty();
	T getFirst();
	T getLast();
	boolean addFirst(T element);
	boolean addLast(T element);
	boolean contains(T element);
	T removeFirst();
	T removeLast();
	boolean remove(T element);
	void clear();
}
