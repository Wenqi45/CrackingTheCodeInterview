package wenqi.crackingthecode.chapter2;

import java.util.LinkedList;
import java.util.Iterator;

/**
 * 
 * @author Wenqi.Wang 
 */
public class SumLists {
	/*
	 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2) .Thatis,617 + 295.
     *         Output: 2 -> 1 -> 9. That is, 912.
	 */
	public static LinkedList<Integer> sumBackOrder(LinkedList<Integer> llist1, LinkedList<Integer> llist2) {
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		Iterator<Integer> iterator1 = llist1.iterator();
		Iterator<Integer> iterator2 = llist2.iterator();

		while ((iterator1.hasNext()) || (iterator2.hasNext())) {
			if (!iterator1.hasNext())
				resultList.add(iterator2.next());
			else if (!iterator2.hasNext()) {
				resultList.add(iterator1.next());
			} else {
				resultList.add(iterator1.next() + iterator2.next());
			}
		}
		//process the resultList by carrier
		int N = resultList.size();
		for (int i = 0; i < N -1; i++) {
			int sum = resultList.get(i);
			if (sum > 10) {
				resultList.set(i, sum%10);
				resultList.set(i + 1,resultList.get(i+1) + 1);
			}
		}
		int lastV = resultList.get(N -1);
		if (lastV >= 10) {resultList.set(N-1, lastV%10); resultList.add(lastV/10);}
		return resultList;
	}
	
	/*
	 * Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).Thatis,617 + 295.
	 * Output: 9 -> 1 -> 2. That is, 912.
	 */
	public static LinkedList<Integer> sumForwardOrder(LinkedList<Integer> llist1, LinkedList<Integer> llist2){
		return null;
	}
	private static LinkedList<Integer> reverseLinkedList(LinkedList llist){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<>(); 
		LinkedList<Integer> l2 = new LinkedList<>();
		
		l1.add(7);l1.add(1);l1.add(6);
		l2.add(5);l2.add(9);l2.add(3);
		LinkedList<Integer> result = sumBackOrder(l1, l2);
		for(Integer i: result)
		     {System.out.println(i);}
		
	}

}
