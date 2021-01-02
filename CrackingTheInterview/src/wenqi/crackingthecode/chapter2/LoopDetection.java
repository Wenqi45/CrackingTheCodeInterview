package wenqi.crackingthecode.chapter2;

import java.util.LinkedList;

/**
 * 
 * @author Wenqi.Wang DEFINITION Circular linked list: A (corrupt) linked list
 *         in which a node's next pointer points to an earlier node, so as to
 *         make a loop in the linked list.
 */
public class LoopDetection {

	/**
	 * EXAMPLE Input: A -> B -> C -> D -) E - > C (the same C as earlier) Output: C
	 * 
	 */
//    public 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> testll = new LinkedList<>();
		Character c = 'C';
		Character a = 'A';
		Character b = 'B';
		Character d = 'D';
		Character e = 'E';

		testll.add(a);
		testll.add(b);
		testll.add(c);
		testll.add(d);
		testll.add(e);
		testll.add(c);

		for (Character ch : testll)
			System.out.println(ch);
//		p = head.next
//	    while (p! = null) {
//	    	beforeP = head;
//		    while (beforeP != p)
//		    	if (p.next == beforeP) return beforeP;
//		    	else beforeP = beforeP.next;
//	    }    
//		return null;    

	}

}
