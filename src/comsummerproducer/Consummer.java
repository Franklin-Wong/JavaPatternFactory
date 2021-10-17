package comsummerproducer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consummer implements Runnable{

	//消费产品数量
	private int number;
	//仓库
	private Store store;
	private BlockingQueue<Object> mblockingQueue = new LinkedBlockingQueue<Object>();

	public void consumme(int num){
		try {
			store.consumme(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Consummer() {
		// TODO Auto-generated constructor stub
	}
	public Consummer(BlockingQueue<Object> blockingQueue) {
		this.mblockingQueue = blockingQueue;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		// 
		consumme(number);
	}
}
