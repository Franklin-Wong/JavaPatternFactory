package comsummerproducer;

import java.util.LinkedList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Store {

	//����ֿ�����
	private final int MAX_SIZE = 100;
	//��������
	private LinkedList<Object> linkedList = new LinkedList<>();
	private BlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<Object>();
	
	//���ɲ�Ʒ����
	public void produce(int num) throws Exception {
		//����ǰ����ס����
		synchronized (linkedList) {
			//�ֿ���������
			while (linkedList.size() + num > MAX_SIZE) {
				System.out.println("�ֿ���������");
				//�̵߳ȴ�
				linkedList.wait();
			}
			//������Ʒ
			for (int i = 0; i < num; i++) {
				linkedList.add(new Object());
				//��������
				linkedList.notifyAll();
				blockingQueue.put(i);
			}
		}
	}
	public void  consumme(int num) throws Exception {
		// ��ס����
		synchronized (linkedList) {
		
			while (linkedList.size() <num) {
				System.out.println("�ֿ��Ʒ������������");
				linkedList.wait();
			}
			//���Ѳ�Ʒ
			for (int i = 0; i < num; i++) {
				linkedList.remove();
				blockingQueue.take();
			}
			//������ ����������
			System.out.println("�ֿ��Ʒ������" + num);

			linkedList.notifyAll();
		}
		
	}
	
	
}
