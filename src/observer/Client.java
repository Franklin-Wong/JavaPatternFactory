package observer;

public class Client {

	public static void main(String[] args) {
		//�����������
		ConcretSubject concretSubject = new ConcretSubject();
		
		//��������۲���
		ConcretObserver observer1 = new ConcretObserver();
		ConcretObserver observer2 = new ConcretObserver();
		ConcretObserver observer3 = new ConcretObserver();
		
		//������ ע��۲���
//		concretSubject.registerObserver(observer1);
//		concretSubject.registerObserver(observer2);
//		concretSubject.registerObserver(observer3);
		
		concretSubject.addObserver(observer1);
		concretSubject.addObserver(observer2);
		concretSubject.addObserver(observer3);

		//�ı䱻�۲�����ı仯
		concretSubject.setState(1);
		
		
	}
}
