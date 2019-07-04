package producerAndConsumer;

public class Consumer implements Runnable {
	private Item item;

	public Consumer(Item m) {
		this.item = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (item) {
			try {
				System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
				item.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Consumer thread got notified at time:" + System.currentTimeMillis());
			// process the Item now
			System.out.println(name + " processed: " + item.getItem());
		}
	}
}
