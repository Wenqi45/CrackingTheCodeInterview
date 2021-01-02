package wenqi.crackingthecode.chapter3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		//test ++i
		int[] intArray = {0, 1,2};
		int i = 1;
		System.out.println("intArray[++i] = " + intArray[++i]);
		System.out.println("i = " + i);
		i = 1;
		System.out.println("intArray[i++] = " + intArray[i++]);
		System.out.println("i = " + i);
		
		Deque<Integer> deque = new ArrayDeque<>(); 
		ArrayList<Integer> alist = new ArrayList<>(); 
		
		//bitwise operator reset head
		int k = 20;
		int h = 15;
		System.out.println(k + "&" + h + " = " + (k&h));
		
		

	}

}
