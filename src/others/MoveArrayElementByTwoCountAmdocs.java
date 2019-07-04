package others;

public class MoveArrayElementByTwoCountAmdocs {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
				   //8,7,1,2,3,4,5,6
		
		int count = 2;
		int temp_arr[] = new int[count];
		
		temp_arr[0] = arr[arr.length-1];
		temp_arr[1] = arr[arr.length-2];
		
		int result_arr[] = new int[arr.length];
		
		for (int i = 0; i < arr.length-2; i++) {
			
			result_arr[i+2] = arr[i];
		}
		
		result_arr[0] = temp_arr[0];
		result_arr[1] = temp_arr[1];
		
		
		for (int i = 0; i < result_arr.length; i++) {
			System.out.print(" "+result_arr[i]);
		}
		
	}

}
