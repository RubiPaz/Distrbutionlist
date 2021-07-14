package LinkedList;

import java.util.Iterator;

public class LinkedList<T> implements IList<T> {

	private Link first;
	
	@Override
	public long length() {
		
		int counter = 0;
		
		Link p = first;
		
		while(p != null) {
			++counter;
			p = p.next;
		}
		
		return counter;
	}

	@Override
	public boolean isEmpty() {
		
		return first == null;
	}

	@Override
	public T getFirst() {
		
		T ret = null;
		
		if(!isEmpty()) {
			ret = first.value;
		}
		
		return ret;
	}

	@Override
	public T getLast() {
		
		T ret = null;
		
		if(!isEmpty()) {
			
			Link p = first;
			
			while(p.next != null) {
				p = p.next;
			}
			
			ret = p.value;
		}
		
		return ret;
	}

	@Override
	public boolean addFirst(T element) {
		
		if(element == null) {
			return false;
		}
		
		// Link nl = new Link();
		// nl.value = element;
		// nl.next = first;
		// first = nl;
		
		first = new Link(element, first);
		
		return true;
	}

	@Override
	public boolean addLast(T element) {
		
		if(element == null) {
			
			return false;
		}
		
		if(first == null) {
			
			first = new Link(element, null);
		
		} else {
			
			Link p = first;
			
			while(p.next != null) {
				
				p = p.next;
			}
			
			p.next = new Link(element, null);
		}
		
		return true;
	}

	@Override
	public boolean contains(T element) {
		
		Link p = first;
		
		while(p != null) {
			
			if(p.value.equals(element)) {
				
				return true;
			}
			
			p = p.next;
		}
		
		return false;
	}

	@Override
	public T removeFirst() {
		
		if(first == null) {
			
			return null;
		}
		
		T ret = first.value;
		
		first = first.next;
		
		return ret;
	}

	@Override
	public T removeLast() {
		
		if(first == null) {
			return null;
		}
		
		if(first.next == null) {
			
			T ret = first.value;
			first = null;
			return ret;
		}
		
		Link p = first;
		
		while(p.next.next != null) {
			
			p = p.next;
		}
		
		T ret = p.next.value;
		
		p.next = null;
		
		return ret;
	}

	@Override
	public boolean remove(T element) {
		
		if(first == null) {
			
			return false;
		}
		
		if(first.value.equals(element)) {
			
			first = first.next;
			
			return true;
		}
		
		Link p = first;
		
		while (p.next != null && !p.next.value.equals(element)) {
			
			p = p.next;			
		}
		
		if(p.next != null) {
			
			p.next = p.next.next;
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		String s = "{";
		Link p = first;
		while (p != null) {
			s += "(" + p.value + ")";
			p = p.next;
		}
		s += "}";
		return s;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	@Override
	public void clear() {
		
		first = null;
	}
	
	private class Link {
		
		T value;
		Link next;
		
		public Link(T value, Link next) {
			this.value = value;
			this.next = next;
		}		
	}
	
	public class LinkedListIterator implements Iterator<T> {

		private Link p = first;

		@Override
		public boolean hasNext() {
			return p != null;
		}

		@Override
		public T next() {
			if (p == null)
				throw new IllegalStateException("There is no next");
			T rval = p.value;
			p = p.next;
			return rval;
		}
	}
}
