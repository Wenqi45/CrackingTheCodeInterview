package wenqi.crackingthecode.chapter1;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Wenqi.Wang
 * 1.2
 *Given two strings, write a method to decide if one is a permutation of the other.
 */

public class StringPermutation {
	/**
	 * runtime O(nlgn) space complexity O(n)
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean isPermutation(String s1, String s2) {
		
		if ((s1 == null)) return false;
		if ((s2 == null)) return false;
		if (s1.length() != s2.length()) return false;
		char[] cArray1 = s1.toCharArray();
		char[] cArray2 = s2.toCharArray();
		Arrays.sort(cArray1);
		Arrays.sort(cArray2);
		
		int N = s1.length();
		for (int i = 0; i < N; i++)
		    if (cArray1[i] != cArray2[i]) return false;
		return true;
	}
	//brute force -- method 2
	
	//
	
	public List[] getAllPermutations(String s) {
		return null;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println();
	}

}
