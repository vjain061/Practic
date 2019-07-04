package searching;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int arr [] = {12,18,23,35,45,65,78,85};
		int n = 18;
		System.out.println("Element present at " +binarySearch(arr,0,arr.length-1,n)+" index");
	}
	
	public static int binarySearch(int arr[],int l,int r,int number) {
		int m = l+(r-1)/2;
		if(number == arr[m]) {
			return m;
		}else if(number < arr[m]) {
			return binarySearch(arr,l,m-1,number);
		}else if(number > arr[m]) {
			return binarySearch(arr,m+1,r,number);
		}
		return -1;
	}

}
