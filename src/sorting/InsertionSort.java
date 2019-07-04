package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7 };
		int[] resultArr = insertionSort(arr);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(" "+resultArr[i]);
		}
	}
	
	public static int[] insertionSort(int []arr){
		int loopCount = 0;
		
		int resultArr[] = new int[arr.length];
		resultArr[0] = arr[0];
		int k = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			resultArr[++k] = arr[i];
			
			for (int j = k; j > 0; j--) {
				loopCount++;
				if(resultArr[j] < resultArr[j-1]){
					int temp = resultArr[j];
					resultArr[j] = resultArr[j-1];
					resultArr[j-1] = temp;
				}
			}
		}
		System.out.println("Sorting done in "+loopCount+" iterations");
		return resultArr;
	}

}
