package wenqi.crackingthecode.chapter3;

public class SetOfStacks {

	private final int STACK_SIZE;
	private StackNode first;

	public SetOfStacks(int size) {
		STACK_SIZE = size;
		first = null;
	}

	public void push(Integer i) {
		if (first == null) {
			first = new StackNode();
			first.push(i);
		} else {
			if (first.isFull()) {
				StackNode oldFirst = first;
				first = new StackNode();
				first.next = oldFirst;
			} else
				first.push(i);
		}

	}

	public Integer pop() {
		int item;
		if (first != null) {
			if (!first.isEmpty())
				item = first.pop();
			else {
				first = first.next;
				item = first.pop();
			}
		} else
			return null;
		return item;
	}

	private class StackNode {
		Integer[] item;
		int N;
		StackNode next;

		StackNode() {
			item = new Integer[STACK_SIZE];
			N = -1;
			next = null;
		}

		void push(Integer i) {
			item[++N] = i;
		}

		Integer pop() {
			return item[N--];
		}

		boolean isFull() {
			return (N == STACK_SIZE - 1);

		}

		boolean isEmpty() {
			return (N == -1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
