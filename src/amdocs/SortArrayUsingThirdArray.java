package amdocs;

public class SortArrayUsingThirdArray {

	public static void main(String[] args) {
		int first[] = {2,5,2,9,6};
		int second[] = {4,3,1,0,7};
		
		sortArray(first,second);
	}

	private static void sortArray(int[] first, int[] second) {
		int result[] = new int[first.length+second.length];
		
		int i = 0;
		for (; i < first.length; i++) {
			result[i] = first[i];
		}
		
		for (int j=0; j < second.length; j++,i++) {
			result[i] = second[j];
		}

		for (int k = 0; k < result.length; k++) {
			for (int j = k + 1; j < result.length; j++) {
				
				if(result[k] > result[j]){
					int temp = result[k];
					result[k] = result[j];
					result[j] = temp;
				}
				
			}
		}
		
		
		
		
		for (int j = 0; j < result.length; j++)
			System.out.println(result[j]);
		
	}

}
