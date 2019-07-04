package producerAndConsumer;

public class Producer implements Runnable {
	private Item item;

	public Producer(Item item) {
		this.item = item;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(5000);
			synchronized (item) {
				item.setItem(name + " Producer work done");
				item.notify();
				// item.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
