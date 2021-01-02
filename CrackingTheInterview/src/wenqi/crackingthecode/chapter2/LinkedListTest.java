package wenqi.crackingthecode.chapter2;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> cList = new LinkedList<>();
		cList.add('j');
		cList.add('a');
		cList.add('v');
		cList.add('a');
		cList.add('!');
		
		Iterator iterator = cList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Iterator dIterator = cList.descendingIterator();
		while (dIterator.hasNext())
			System.out.println(dIterator.next());
		Iterator iteratorIndex = cList.listIterator(3);
		while (iteratorIndex.hasNext())
			System.out.println(iteratorIndex.next());
		
	}

}
