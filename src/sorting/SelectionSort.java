package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int[] resultArr = selectionSort(arr);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(" "+resultArr[i]);
		}
		
	}
	public static int[] selectionSort(int[] arr){
		int loopCount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				loopCount++;
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Sorting done in "+loopCount+" iterations");
		return arr;
	}

}
