package arraysPrograms;

public class Anagrams {

	public static void main(String[] args) {

		String s = "AAB";
		String s1 = "ABC";
		boolean isAnagram = false;

		if (s.length() == s1.length()) {

			for (int i = 0; i < s.length(); i++) {

				isAnagram = false;
				char x = s.charAt(i);

				for (int j = 0; j < s1.length(); j++) {

					if (s1.charAt(j) == x) {
						isAnagram = true;
						break;

					}

				}

			}

		}
		if (isAnagram) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("It is not");

		}

	}

}
