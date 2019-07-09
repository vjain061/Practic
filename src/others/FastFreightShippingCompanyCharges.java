package others;

import java.util.Scanner;

public class FastFreightShippingCompanyCharges {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter weight");
		double weight = scan.nextDouble();
		System.out.println("Enter Distance");
		int distance = scan.nextInt();

		System.out.println("Rate : " + calculateRate(weight, distance));
		scan.close();
	}

	private static double calculateRate(double weight, int distance) {
		double result = 0;

		/*
		 * 500 Miles 2 pound or less -> 1.10 over 2 pound but no more than 6
		 * pound -> 2.20 over 6 pound but no more than 10 pound -> 3.70 over 10
		 * pounds -> 4.80
		 */
		// 1150
		// 6.5

		while (distance >= 0) {
			if (distance <= 500) {
				result += getRate(weight);
				return result;
			}else{
				distance -= 500;
				result += getRate(weight);
			}
				
			
		}
		return result;
	}

	private static double getRate(double weight) {
		int choice;
		if (weight > 0 && weight <= 2)
			choice = 1;
		else if (weight > 2 && weight <= 6)
			choice = 2;
		else if (weight > 6 && weight <= 10)
			choice = 3;
		else
			choice = 4;

		switch (choice) {
		case 1:
			return 1.10;
			
		case 2:
			return 2.20;
			
		case 3:
			return 3.70;
			
		case 4:
			return 4.80;
		}
		return 0;
	}

}
