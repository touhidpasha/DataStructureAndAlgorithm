package algorithms;

public class InsertionSortClass {
	
//	/**
//	 * Function to sort array using insertion sort
//	 * 
//	 * @param arr the array which needs to be sorted
//	 * 
//	 */
	public static String[] insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; ++i) {
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(temp) < 0) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
	
	 
	
	public static void main(String[] args) {
		String[] arr=new String[] {"touhid","system","pasha","tptp"};
		System.out.println("before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		arr=insertionSort(arr);
		System.out.println("after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	

}
