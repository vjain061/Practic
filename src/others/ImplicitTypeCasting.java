package other;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		method1((short)10);
	}

	public static void method1(short i) {
		System.out.println("Sort method : "+i);
	}
	public static void method1(byte i) {
		System.out.println("byte method : "+i);
	}
	/*public static void method1(int i) {
		System.out.println("int method : "+i);
	}*/

	/*public static void method1(long i) {
		System.out.println("long method : "+i);
	}*/
}
