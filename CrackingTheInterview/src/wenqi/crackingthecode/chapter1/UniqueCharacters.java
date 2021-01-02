package wenqi.crackingthecode.chapter1;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/**
 * 
 * @author Wenqi.Wang Is Unique: Implement an algorithm to determine if a string
 *         has all unique characters. What if you cannot use additional data
 *         structures?
 */
public class UniqueCharacters {

	public Boolean isUniqueMethod(String s) {
		boolean isUnique = true;
		char[] cArray = s.toCharArray();
		Arrays.sort(cArray);
		for (int i = 0; i < cArray.length - 1; i++)
			if (cArray[i] == cArray[i + 1]) {
				isUnique = false;
				break;
			}

		System.out.println(s + " is unique " + isUnique);
		return isUnique;
	}

	public boolean isUniqueMethod2(String s) {
		boolean isUnique = true;
		Set<Character> characterSet = new HashSet<Character>();
		char[] setArray = s.toCharArray();

		for (int i = 0; i < setArray.length; i++) {

			if (characterSet.add(setArray[i]) == false) {
				isUnique = false;
				break;
			}
		}
		System.out.println(s + " is unique " + isUnique);
		return isUnique;
	}
	/**
	 * O(1) 
	 * space complexity O(N)
	 * @param s
	 * @return
	 */
	public static boolean isUnquieMethod3(String s) {
		// assume characters are ascii
		// String s3 = "abcde";
		if (s.length() > 128) return false;
		boolean isUnique = true;
		char[] c3Array = s.toCharArray();
		Boolean[] asciiTable = new Boolean[128];
		for (int i = 0; i < asciiTable.length; i++)
			asciiTable[i] = false;

		int asciiIndex;
		for (int i = 0; i < c3Array.length; i++) {
			asciiIndex = (int) c3Array[i];
			System.out.println(c3Array[i] + "ASCII code is " + asciiIndex);
			if (asciiTable[asciiIndex] == true) {
				isUnique = false;
				break;
			} else
				asciiTable[asciiIndex] = true;
		}
		System.out.println(s + " is unique " + isUnique);
		return isUnique;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method 1

		// method 2
		String s2 = "stay1";
		isUnquieMethod3(s2);
		System.out.println("文奇，你好�?");
		System.out.println();
	}

}
