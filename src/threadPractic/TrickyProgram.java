package threadPractic;

class TrickyProgramMyThread extends Thread {
	TrickyProgramMyThread() {
		System.out.print(" MyThread");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.println(" baz");
	}
}

public class TrickyProgram {
	public static void main(String[] args) {
		Thread t = new TrickyProgramMyThread() {
			public void run() {
				System.out.println(" foo");
			}
		};
		t.start();
	}
}
