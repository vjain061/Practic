package others;

public class OverridingStaticMethod extends Exception {

	public static void main(String[] args) {
		OverridingStaticMethod t1 = new OverridingStaticMethod();
		OverridingStaticMethod t2 = new Child();
		OverridingStaticMethod t3 = null;
		Child c = new Child();
		t1.m1();
		t2.m1();
		t3.m1();
		c.m1();

	}

	public static void m1() {
		System.out.println("Parent");
	}
}

class Child extends OverridingStaticMethod {
	public static void m1() {
		System.out.println("Parent");
	}
}
