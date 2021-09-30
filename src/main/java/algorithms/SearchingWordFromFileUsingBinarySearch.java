package algorithms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingWordFromFileUsingBinarySearch {
	/**
	 * Function to read the file and return
	 * 
	 * @param f the file which to read
	 * @return the string which to read
	 * @throws IOException
	 */
	public static String[] fileRead(File f) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		int c;
		while ((c = fr.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

//	/**
//	 * Function to sort string array using bubble sort algorithm
//	 * 
//	 * @param arr the array which needs to be sorted
//	 */
	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

//	/**
//	 * Function to search a string in string array using binary search
//	 * 
//	 * @param arr the array in which element to be searched
//	 * @param s   the string element which needs to be searched
//	 * @return -1 if not found or the index of element if found
//	 */
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Main function to test the class
	 * 
	 * @param args
	 * @throws Exception if input is not correct
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("/home/touhidpasha/eclipse-workspace/DataStructureAndAlgorithm/textfile.txt");
		try {
			Scanner s = new Scanner(System.in);
			String arr[] = fileRead(f);
			for (String string : arr) {
				System.out.println(string);
			}
			System.out.println("enter name to search");
			String s1 = s.nextLine();
			int i = binary(arr, s1);
			if (i < 0)
				System.out.println("not found");
			else
				System.out.println("found");
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
}
