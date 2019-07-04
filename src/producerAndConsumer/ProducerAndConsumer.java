package producerAndConsumer;

public class ProducerAndConsumer {

	public static void main(String[] args) {
		Item msg = new Item("process it");
        Consumer Consumer = new Consumer(msg);
        new Thread(Consumer,"Consumer").start();
        
        Consumer Consumer1 = new Consumer(msg);
        new Thread(Consumer1, "Consumer1").start();
        
        Producer Producer = new Producer(msg);
        new Thread(Producer, "Producer").start();
        System.out.println("All the threads are started");
	}

}
