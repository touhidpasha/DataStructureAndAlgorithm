package algorithms;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {

	public static void printPermtsIterative(String str) {
		// base case
		if (str == null || str.length() == 0) {
			return;
		}

		// create an empty ArrayList to store (partial) permutations
		List<String> partial = new ArrayList<String>();

		// initialize the list with the first character of the string
		partial.add(String.valueOf(str.charAt(0)));

		// do for every character of the specified string
		for (int i = 1; i < str.length(); i++) {
			// consider previously constructed partial permutation one by one

			// (iterate backward to avoid ConcurrentModificationException)
			for (int j = partial.size() - 1; j >= 0; j--) {
				// remove current partial permutation from the ArrayList
				String s = partial.remove(j);

				// Insert the next character of the specified string at all
				// possible positions of current partial permutation. Then
				// insert each of these newly constructed strings in the list

				for (int k = 0; k <= s.length(); k++) {
					// Advice: use StringBuilder for concatenation
					partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}

		System.out.println(partial);
	}

// Function to print all the permutations of str
	static void printPermutnRec(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutnRec(ros, ans + ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		System.out.println("Permutations using iteration");
		printPermtsIterative(str);
		System.out.println("Permutations using recursion");
		printPermutnRec(str, "");

	}

}
