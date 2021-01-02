package wenqi.crackingthecode.chapter2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

public class PalindromeLinkedList {

	public static boolean isPalindromePermutation(LinkedList<Character> ll) {

		if (ll.size() == 0)
			return false;
		HashMap<Character, Integer> statMap = new HashMap<>();
		Iterator<Character> iterator = ll.iterator();
		while (iterator.hasNext()) {
			Character c = iterator.next();
			if (statMap.get(c) != null)
				statMap.put(c, statMap.get(c) + 1);
			else
				statMap.put(c, 1);
		}
		int oddCount = 0;
		Collection<Integer> values = statMap.values();
		for (Integer i : values) {
			if (i % 2 != 0)
				oddCount++;
			if (oddCount >= 2)
				break;
		}
		return (oddCount < 2);
	}
   // assume that linkedlist is double linked list 
	public static boolean isPalindrome(LinkedList<Character> ll) {
		if (ll == null) return false;
		Iterator<Character> forwardIterator = ll.iterator();
		Iterator<Character> backwardIterator = ll.descendingIterator();
		while (forwardIterator.hasNext() && backwardIterator.hasNext())
		       if (forwardIterator.next() != backwardIterator.next()) return false;
		
		return true;
		    	   
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> testLink = new LinkedList<Character>();
		testLink.add('a');
		testLink.add('b');
		testLink.add('b');
		testLink.add('c');
		testLink.add('a');
		System.out.println("is PalindromePermutation ?" + isPalindromePermutation(testLink));
		
		System.out.println("is Palindrome ?" + isPalindrome(testLink));
	}

}
