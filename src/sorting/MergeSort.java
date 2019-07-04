package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 2, 56, 18, 4, 10, 25, 75, 3 };
		int resultArr[] = mergeSort(arr, arr.length/2, arr.length);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(" " + resultArr[i]);
		}
		System.out.println();

	}

	public static int[] mergeSort(int arr[], int h, int n) {

		int t[] = new int[n + 1];
		t[n] = Integer.MAX_VALUE;

		int k = 0;
		while (k < n) {
			t[k] = arr[k];
			k++;
		}
		k = 0;
		int i = 0;
		int j = h;
		while (i < h) {
			if (t[i] <= t[j]) {
				arr[k] = t[i];
				i++;
			} else {
				arr[k] = t[j];
				j++;
			}
			k++;
		}

		return arr;
	}
}
