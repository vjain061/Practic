package threadingPractic;

public class YieldMethod implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		YieldMethod y = new YieldMethod();
		Thread t = new Thread(y);
		t.setName("t");
		t.start();
		
		Thread t2 = new Thread(y);
		t2.setName("t2");
		t2.start();
		
		t.join();
		
	}

	@Override
	public void run() {
		for(int i=1;i<6;i++){
			System.out.println(Thread.currentThread() +" "+i);
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}

}
