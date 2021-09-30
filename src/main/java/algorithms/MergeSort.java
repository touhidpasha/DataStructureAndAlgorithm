package algorithms;

public class MergeSort {
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
		int[] arr=new int[]{3,1,5,7,9,4,2,8};
		int[] arr1=new int[arr.length/2];
		int[] arr2=new int[arr.length/2];
		for(int i=0;i<arr.length/2;i++) {
			arr1[i]=arr[i];
		}
		for(int i=arr.length/2,j=0;i<arr.length;i++,j++) {
			arr2[j]=arr[i];
		}
		arr1=bubbleSort(arr1);
		arr2=bubbleSort(arr2);
		
		for(int i=0;i<arr.length/2;i++) {
			System.out.println(arr1[i]);
		}
		for(int i=arr.length/2,j=0;i<arr.length;j++,i++) {
			System.out.println(arr2[j]);
		}
	}
	

}
