package threadPractic;

public class WaitMethodWorking {

	public static void main(String[] args) {
		Thread firstThread = new Thread(new MyThread());
		
		firstThread.start();
	}

}


class MyThread implements Runnable{

	@Override
	public void run() {
		
	}
	
}
