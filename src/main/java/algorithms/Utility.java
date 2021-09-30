package algorithms;

import java.util.ArrayList;

public class Utility {
//
	
	
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
////	/**
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
////	/**
//	 * Function to sort array using insertion sort
//	 * 
//	 * @param arr the array which needs to be sorted
//	 * 
//	 */
	public static String[] insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(temp) < 0) {
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

}
