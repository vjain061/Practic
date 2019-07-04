package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr [] = {2,8,15,25,36,48,53,87,96};
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter element to search");
			int n = scan.nextInt();
			if(n == 0)
				System.exit(1);
			System.out.println((binarySearch(arr,n))?"":"Element did not found");
		}
	}
	
	public static boolean binarySearch(int arr[],int n){
		int l = 0;
		int r = arr.length-1;
		int m = (l + r) / 2;
		
		while(l <= r){
			if(n == arr[m]){
				System.out.println("Number found at "+m+" index");
				return true;
				
			}else if(n < arr[m]){
				r = m-1;
				m = (l + r) / 2;
			}else if(n > arr[m]){
				l = m+1;
				m = (l + r) / 2;
			}
		}
		return false;
	}

}
