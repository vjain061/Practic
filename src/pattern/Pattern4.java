package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		
		int $_ = 6;
		System.out.println($_);
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i+1 ; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
