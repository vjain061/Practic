package pattern;

public class Pattern1 {
	public static void main(String[] args) {
		
		int a [] = {0,0,0,0,0,1};
		
		
		int []new_a = {};
		
		
		for (int i = 1; i <= 5; i++) {
			

			if(new_a.length != 0) {
				a = new_a;
			}
				
			
			for (int j = 0; j < a.length; j++) {
				if(a[j] == 0)
					System.out.print(" ");
				else
					System.out.print(a[j]);
			}
			System.out.println();
			
			int lengthOfNewArray = a.length+1;
			
			new_a = new int[lengthOfNewArray];
			new_a[lengthOfNewArray-1] = 1;
			
			
			
			for (int k = 0; k < a.length; k++) {
				if(k+1 == a.length-1) {
					break;
				}
				
				int firstIndex = k;
				int lastIndex = k+2;
				
				int indexForNewArray = lastIndex-1;
				
				new_a[indexForNewArray] = a[firstIndex] + a[lastIndex];
						
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
}

//              1
//             1 1
//            1 2 1 
//           1 3 3 1 
//          1 4 6 4 1
