package proxypattern;

public class RealSubject implements Subject{

	@Override
	public void visit() {
		//ʵ�־����߼�
		System.out.println("RealSubject--Method----");
	}
}
