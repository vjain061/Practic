package callableAndExecutor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return Thread.currentThread().getName();
	}
	
}

public class CallableAndExecutor {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		List<Future<String>> futureList = new ArrayList<Future<String>>();
		
		Callable<String> callable = new MyCallable();
		
		for (int i = 0; i < 10; i++) {
			
			futureList.add(executorService.submit(callable));
			
		}
		for(Future<String> futureObject : futureList){
			try {
				System.out.println(new Date() + " :: "+futureObject.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executorService.shutdown();
		
	}
}
