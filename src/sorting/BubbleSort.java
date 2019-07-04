package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int resultArr[] = bubbleSort(arr);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(" "+resultArr[i]);
		}
	}
	
	public static int[] bubbleSort(int[] arr){
		
		int loopCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				loopCount++;
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorting done in "+loopCount+" iterations");
		return arr;
	}
	
}
