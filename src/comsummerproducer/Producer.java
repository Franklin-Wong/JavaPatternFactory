package comsummerproducer;

public class Producer implements Runnable{

	private int number;
	private Store store;
	
	public void produce(int num) throws Exception{
		store.produce(num);
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
		try {
			produce(number);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
