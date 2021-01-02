package wenqi.crackingthecode.chapter3;

import java.util.Iterator;

public class StackMin implements Iterable<Integer> {
	Integer min = Integer.MAX_VALUE;
	Node<Integer> first;
	Node<Integer> minP;

	public StackMin() {
		first = null;
		minP = null;
	}

	public void push(int i) {
		if (first == null) {
			first = new Node<Integer>(i);
			minP = first;
		} else {
			Node<Integer> oldFirst = first;
			first = new Node<Integer>(i);
			first.next = oldFirst;
			if (minP.item > i)
				minP = first;
		}
	}

	public Integer pop() {
		if (first == null)
			return null;
		Integer item = first.item;
		Node<Integer> oldFirst = first;
		first = first.next;
		if (minP == oldFirst)
			checkMin();
		return item;

	}

	private void checkMin() {
		Node<Integer> p = first;
		minP = first;
		while (p != null) {
			if (p.item < minP.item)
				minP = p;
			p = p.next;
		}

	}

	private class Node<Integer> {
		Integer item;
		Node<Integer> next;

		Node(Integer item) {
			this.item = item;
			next = null;
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new stackIterator();
	}

	private class stackIterator implements Iterator<Integer> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	public Integer getMin() {
		return minP.item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMin stackMin = new StackMin();
		stackMin.push(5);
		stackMin.push(8);
		stackMin.push(2);
		stackMin.push(1);
		stackMin.push(9);
		
		System.out.println("The min of this stack is " + stackMin.getMin());
		stackMin.pop();
		stackMin.pop();
		System.out.println("After pops, the min of this stack is " + stackMin.getMin());
		
		stackMin.push(12);
		stackMin.push(1);
		stackMin.push(8);
		System.out.println("After push, the min of this stack is " + stackMin.getMin());
	}
}
