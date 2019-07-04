package searching;

public class JumpSearch {

	public static void main(String[] args) {
		int a[] = {8,12,15,20,26,28,34,38,45,48,58,69,78,89,98};
		
		int index = jumpSearch(a,58);
		if(index != -1)
			System.out.println("Element found at index "+index);
		else
			System.out.println("Element is not available in array");
	}
	
	
	public static int jumpSearch(int []a,int n) {
		int squreRoot = (int)Math.sqrt(a.length);
		for (int i = 0; i < a.length; ) {
			
			if(a[a.length-1] < n)
				return -1;
			
			if(a[i] == n) {
				return i;
			}else if(i > 0 && n <= a[i]) {
				for (int j = i; j >= 0; j--) {
					if(n == a[j]) {
						return j;
					}
				}
				return -1;
			}else {
				i = i + squreRoot;
				if(i > a.length-1)
					i = a.length-1;
			}
		}
		return -1;
	}

}
