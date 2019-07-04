package threadingPractic;

public class WaitMethodWorking {

	public static void main(String[] args) {
		Thread t = new Thread(new MyThread(), "FirstThread");
		Thread t2 = new Thread(new MyThread(), "SecondThread");

		t.setPriority(10);
		t.start();
		t2.start();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {

		try {
			printTable();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public synchronized void printTable() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread() + " " + i);
			//this.wait(500);
			this.notify();
			System.out.println("Task done for "+Thread.currentThread());
		}
	}
}
