package algorithms;

public class BubbleSort {
//	 * Function to sort implementing bubble sort algorithm
//	 * 
//	 * @param arr
//	 * @return
//	 */
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 1, 5, 9, 8, 7 };
		arr = bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
