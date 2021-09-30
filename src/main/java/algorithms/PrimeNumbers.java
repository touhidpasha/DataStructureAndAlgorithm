package algorithms;

import java.util.ArrayList;

public class PrimeNumbers {
	/**
	 * Function to print the prime no between to 1 to 1000
	 */
	public static void prime() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				System.out.print(j + " ");
		}
	}
	/**
	 * Function to check if no is anagram or not
	 */
	public static int[] count(int n) {
	int[] count = new int[10];
	int temp = n;
	while (temp != 0) {
		int r = temp % 10;
		count[r]++;
		temp = temp / 10;
	}
	return count;
}
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
 }
	public static void main(String[] args) {
	prime();
	System.out.println("\nfrom above prime angrams are");
	primeAnagrams();
	}
}
