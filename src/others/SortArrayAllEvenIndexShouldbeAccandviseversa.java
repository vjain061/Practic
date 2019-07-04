package others;

public class SortArrayAllEvenIndexShouldbeAccandviseversa {
	public static void main(String[] args) {
		
		int a[] = { 3, 1, 2, 4, 5, 9, 13, 14, 12 };
		sort(a);
		
	}

	private static void sort(int[] a) {
		
		int result[] = new int[a.length];
		int countResult = 0;
		
		for (int i = 0; i < a.length; i += 2) {
			for (int j = i+2; j < a.length; j += 2) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 1; i < a.length; i += 2) {
			for (int j = i+2; j < a.length; j += 2) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i += 2) {
			result[countResult++] = a[i];
		}
		for (int i = 1; i < a.length; i += 2) {
			result[countResult++] = a[i];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}
}
