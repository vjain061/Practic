package others;

public class SortArrayButEvenAtOddAndOddAtEvenLocation {

	public static void main(String[] args) {
		//int a[] = { 5, 1, 4, 3, 8, 6, 2, 7 };
		int a[] = { 1,2,8,9,3,4 };
		sort(a);
	}

	public static void sort(int a[]) {
		int first_a[] = new int[a.length / 2];
		int first_b[] = new int[a.length / 2];
		int i_for_first_a = 0;
		int i_for_first_b = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				first_a[i_for_first_a++] = a[i];
			} else {
				first_b[i_for_first_b++] = a[i];
			}
		}
		sortArray(first_a);
		sortArray(first_b);

		int result[] = new int[a.length];
		
		i_for_first_a = 0;
		i_for_first_b = 1;
		
		for (int i = 0,j = 0; i < first_a.length & j < first_b.length; i++,j++) {
			result[i_for_first_a] = first_a[i];
			i_for_first_a += 2;
			result[i_for_first_b] = first_b[j];
			i_for_first_b += 2;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}
	public static void sortArray(int arrayTobeSort[]) {
		for (int i = 0; i < arrayTobeSort.length; i++) {
			for (int j = i + 1; j < arrayTobeSort.length; j++) {
				if (arrayTobeSort[i] > arrayTobeSort[j]) {
					int temp = arrayTobeSort[i];
					arrayTobeSort[i] = arrayTobeSort[j];
					arrayTobeSort[j] = temp;
				}
			}

		}
	}

}
