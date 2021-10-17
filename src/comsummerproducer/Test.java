package comsummerproducer;

import java.util.concurrent.LinkedBlockingQueue;

public class Test {

	public static void main(String[] args) {
		LinkedBlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<>();
		
		
		Store store = new Store();
		Consummer consummer1 = new Consummer();
		consummer1.setNumber(10);
		consummer1.setStore(store);
		Consummer consummer2 = new Consummer();
		consummer2.setNumber(80);
		consummer2.setStore(store);
		
		Producer producer1 = new Producer();
		producer1.setNumber(30);
		producer1.setStore(store);
		
		Producer producer2 = new Producer();
		producer2.setNumber(50);
		producer2.setStore(store);
		
		producer1.run();
		consummer1.run();
		
		producer2.run();
		consummer2.run();
	}
}
