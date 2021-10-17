package comsummerproducer;

import java.util.LinkedList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Store {

	//定义仓库容量
	private final int MAX_SIZE = 100;
	//定义容器
	private LinkedList<Object> linkedList = new LinkedList<>();
	private BlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<Object>();
	
	//生成产品个数
	public void produce(int num) throws Exception {
		//操作前，锁住对象
		synchronized (linkedList) {
			//仓库容量不足
			while (linkedList.size() + num > MAX_SIZE) {
				System.out.println("仓库容量不足");
				//线程等待
				linkedList.wait();
			}
			//生产产品
			for (int i = 0; i < num; i++) {
				linkedList.add(new Object());
				//唤醒所有
				linkedList.notifyAll();
				blockingQueue.put(i);
			}
		}
	}
	public void  consumme(int num) throws Exception {
		// 锁住对象
		synchronized (linkedList) {
		
			while (linkedList.size() <num) {
				System.out.println("仓库产品数量不足消费");
				linkedList.wait();
			}
			//消费产品
			for (int i = 0; i < num; i++) {
				linkedList.remove();
				blockingQueue.take();
			}
			//消费者 消费数量是
			System.out.println("仓库产品数量是" + num);

			linkedList.notifyAll();
		}
		
	}
	
	
}
