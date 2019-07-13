package tricky;

public class PridictOutput9 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1 == i2);
		
		Integer i3 = 100;
		Integer i4 = i3;
		i3++;
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i3 == i4);
		
		Integer num1 = 500;
		Integer num2 = num1;
		num1++; 
		num1--;
		System.out.println(num1==num2);

		Integer i5 = new Integer(0);
		Float f5 = new Float(0);
		
		//System.out.println(i5 == f5);
		
		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1L)));
		
		
	}

}
