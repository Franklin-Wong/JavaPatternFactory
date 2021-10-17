package observer;

public class Client {

	public static void main(String[] args) {
		//创建主题对象
		ConcretSubject concretSubject = new ConcretSubject();
		
		//创建多个观察者
		ConcretObserver observer1 = new ConcretObserver();
		ConcretObserver observer2 = new ConcretObserver();
		ConcretObserver observer3 = new ConcretObserver();
		
		//用主题 注册观察者
//		concretSubject.registerObserver(observer1);
//		concretSubject.registerObserver(observer2);
//		concretSubject.registerObserver(observer3);
		
		concretSubject.addObserver(observer1);
		concretSubject.addObserver(observer2);
		concretSubject.addObserver(observer3);

		//改变被观察主题的变化
		concretSubject.setState(1);
		
		
	}
}
