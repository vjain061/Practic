package tricky;

class A {
	static int i = 1111;

	static {
		i = i-- - --i;
		System.out.println("Static block of A : "+i);
	}

	{
		i = i++ + ++i;
		System.out.println("Non-Static block of A : "+i);
	}
}

class B extends A {
	static {
		i = --i - i--;
		System.out.println("Static block of B : "+i);
	}

	{
		i = ++i + i++;
		System.out.println("Non-Static block of B : "+i);
	}
}

public class PridictOutput3 {
	public static void main(String[] args) {
		B b = new B();

		System.out.println(b.i);
	}
}
