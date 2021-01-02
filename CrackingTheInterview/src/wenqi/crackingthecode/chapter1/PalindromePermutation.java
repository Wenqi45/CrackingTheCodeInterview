package wenqi.crackingthecode.chapter1;

import java.util.HashMap;
import java.util.Collection;

public class PalindromePermutation {

	public static final int ASCII_COUNT = 128;

	public static boolean IsPalindromePermutation(String s) {

		HashMap<Character, Integer> charMap = new HashMap<>();
		if (s == null)
			return false;

		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				int count = charMap.get(c);
				charMap.put(c, ++count);
			} else
				charMap.put(c, 1);
		}

		Collection<Integer> values = charMap.values();
		int oddCount = 0;
		for (int i : values) {
			if (i % 2 != 0)
				oddCount++;
		}
		return (oddCount< 2);
	}

	// character set is ASCII constant - constrains
	/**
	 * 1. ascii ? Unicode
	 * 2. uppercase & lowercase?
	 * 3. space ?
	 * @param s
	 * @return
	 */
	public static boolean IsPalindromePermutation2(String s) {

		int[] countArray = new int[ASCII_COUNT];

		for (int i = 0; i < countArray.length; i++)
			countArray[i] = 0;
		for (int i = 0; i < s.length(); i++) {
			int arrayIndex = (int) s.charAt(i);
			countArray[arrayIndex]++;
		}

		int oddCount = 0;
		for (int i : countArray) {
			if (i % 2 != 0)
				oddCount++;
			if (oddCount >= 2)
				break;
		}

		return (oddCount <2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString = "tac12tca";
		System.out.println(testString + " is " + IsPalindromePermutation(testString));
		
		System.out.println(testString + " is " + IsPalindromePermutation2(testString));

	}

}
