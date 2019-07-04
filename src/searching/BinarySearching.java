package searching;

public class BinarySearching {

	public static void main(String[] args) {
		int arr [] = {12,18,23,35,45,65,78,85};
		
		int m = arr.length/2;
		int l = 0;
		int r = arr.length-1;
		int number = 453;
		boolean isFound = false;
		
		while(l <= m) {
			if(number == arr[m]) {
				System.out.println(number+" present at "+(m+1)+" location");
				isFound = true;
				break;
			}else if(number == arr[r] ) {
				System.out.println(number+" present at "+(r+1)+" location");
				isFound = true;
				break;
			}else if(number == arr[l]) {
				System.out.println(number+" present at "+(l+1)+" location");
				isFound = true;
				break;
			}else if(number < arr[m]) {
				r = m-1;
				m = r/2;
			}else if(number > arr[m]) {
				l = m+1;
				m = (l+r)/2;
			}
			
		}
		if(!isFound)
			System.out.println("Element is not found");
		
	}

}
