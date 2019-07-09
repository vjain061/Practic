package exceptionConcept;

public class ExceptionHandlingPractic {

	public static void main(String[] args) {
		System.out.println("main thread starts");
		Thread t1 = new Thread(new MyRunnable(), "firstThread");

		t1.start();
		/*
		 * try { t1.join(); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		System.out.println("main thread ends");

		X x = new X();

		x.calculate(10, 20);

		Y y = (Y) x;

		y.calculate(50, 100);

		Z z = (Z) y;

		z.calculate(100, 200);
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Method start for " + Thread.currentThread());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run Method start for " + Thread.currentThread());
	}

}

class X {
	void calculate(int a, int b) {
		System.out.println("Class X");
	}
}

class Y extends X {
	@Override
	void calculate(int a, int b) {
		System.out.println("Class Y");
	}
}

class Z extends Y {
	@Override
	void calculate(int a, int b) {
		System.out.println("Class Z");
	}
}
