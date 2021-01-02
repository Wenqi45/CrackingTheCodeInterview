package wenqi.crackingthecode.chapter1;

/**
 * 
 * @author Wenqi.Wang three types of edits that can be performed on strings:
 *         insert a character, remove a character, or replace a character. Given
 *         two strings, write a function to check if they are one edit (or zero
 *         edits) away.
 */
public class OneEditAway {

	public static boolean isOneEditAway(String sourceString, String editedString) {
		int difference = Math.abs(sourceString.length() - editedString.length());
		if (difference >= 2)
			return false;
		// boolean isOneEditAway = true;
		if (difference == 1) {
			if (isOneInsertAway(sourceString, editedString))
				return true;
			if (isOneDeleteAway(sourceString, editedString))
				return true;
		}
		if (difference == 0) {
			if (isOneReplaceAway(sourceString, editedString))
				return true;
		}

		return false;
	}

	private static boolean isOneInsertAway(String s1, String s2) {
		assert (s2.length() - s1.length()) == 1;

		// int sameCount = 0;
		int i = 0;
		while (s1.charAt(i) == s2.charAt(i)) {
			if (++i >= s1.length())
				break;
		}
		
		if (i == s1.length())
			return true;
		for (int k = i; k < s1.length(); k++)
			if (s1.charAt(k) != s2.charAt(k + 1))
				return false;

		return true;
	}

	private static boolean isOneDeleteAway(String s1, String s2) {
		return isOneInsertAway(s2, s1);
	}

	private static boolean isOneReplaceAway(String s1, String s2) {
		assert s1.length() == s2.length();
		
		int i = 0;
		while (s1.charAt(i) == s2.charAt(i))
			if (++i >= s1.length()) break;
		for (int k = i + 1; k < s1.length(); k++)
			if (s1.charAt(k) != s2.charAt(k)) return false;
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "pale";
		String s2 = "pales";
		System.out.println(s1 + " is " + s2 + "one edit away is " + isOneInsertAway(s1, s2));
		System.out.println(s1 + " is " + s2 + "one delete away is " + isOneDeleteAway(s2, s1));
		
		String s3 = "bake";
		System.out.println(s1 + " is " + s3 + "one replace away is " + isOneReplaceAway(s1, s3));

	}

}
