package Repository;

public class WordRepository {

	public static boolean isAnagramPalindrome(String word) {
		int oddOccur = 0;
		int[] count = new int[256];

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			count[ch]++;
		}

		for (int cnt : count) {
			if (oddOccur > 1) {
				return false;
			}
			if (cnt % 2 == 1) {
				oddOccur++;
			}
		}
		return true;
	}

	public static boolean findPalindrome(String word) {

		int length = word.length();
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (word.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
