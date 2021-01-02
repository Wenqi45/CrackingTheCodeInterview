package wenqi.crackingthecode.chapter1;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters.
 *
 * @author Wenqi.Wang
 *
 */

public class StringCompresser {

	/**
	 * For example, the string aabcccccaaa would become a2b1c5a3. If the
	 * "compressed" string would not become smaller than the original string, your
	 * method should return the original string. Constrain: only uppercase and
	 * lowercase letters
	 * 
	 * @param s
	 */
	public static String basicCompresser(String s) {
		int previousPos = 0;
		int currentPos = 0;
		StringBuilder newString = new StringBuilder();
		char[] charArray = s.toCharArray();
		int N = charArray.length;
		int repeatCount = 0;
		for (int i = 0; i < N; i = i + repeatCount) {
			newString.append(charArray[i]);
			currentPos = i;
			repeatCount = 0;
			while (charArray[currentPos] == charArray[previousPos]) {
				repeatCount++;
				if (++currentPos >= N)
					break;
			}
			newString.append(repeatCount);
			previousPos = currentPos;

		}
		if (newString.length() < N)
			return newString.toString();
		else
			return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "aabccc12222";
		System.out.println(testString + " after compression is " + basicCompresser(testString));
	}

}
