package coreInterview;

import java.util.HashMap;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "stress";
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
		int i, length;
		Character c;
		length = str.length(); // Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (characterhashtable.containsKey(c)) {
				characterhashtable.put(c, characterhashtable.get(c) + 1);
			} else {
				characterhashtable.put(c, 1);
			}
		}

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (characterhashtable.get(c) == 1)
				return c;
		}
		return null;
	}
}