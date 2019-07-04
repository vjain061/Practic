package threadPractic;

public class JoinMethodWorkingInThread implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		Thread firstThread = new Thread(new JoinMethodWorkingInThread());
		firstThread.setName("firstThread");
		firstThread.start();
		firstThread.join();
		
		
		Thread secondThread = new Thread(new JoinMethodWorkingInThread());
		secondThread.setName("secondThread");
		secondThread.start();
		secondThread.join();
		
		Thread thirdThread = new Thread(new JoinMethodWorkingInThread());
		thirdThread.setName("thirdThread");
		thirdThread.start();
	}

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
