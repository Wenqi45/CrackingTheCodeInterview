package wenqi.crackingthecode.chapter2;

import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Wenqi.Wang remove duplicates from an unsorted linked list.
 * @Date Dec. 29, 2020
 *
 * @param <Comparable>
 */
public class DupRemover<Comparable> {

	public List<Comparable> remove(LinkedList<Comparable> llist) {

		for (int i = 0; i < llist.size(); i++) {
			Comparable item = llist.get(i);
			int lastIndex = llist.lastIndexOf(item);
			while (lastIndex != i) {
				llist.remove(lastIndex);
				lastIndex = llist.lastIndexOf(item);
			}
		}
		return llist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Character> testList = new LinkedList<Character>();
		testList.add('j');
		testList.add('a');
		testList.add('v');
		testList.add('a');
		testList.add('j');
		
		List<Character> resultList = new DupRemover<Character>().remove(testList);
		for(Character c: resultList) {
			System.out.println(c);
		}

	}

}
