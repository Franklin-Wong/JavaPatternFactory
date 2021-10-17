package proxypattern;

public class RealSubject implements Subject{

	@Override
	public void visit() {
		//实现具体逻辑
		System.out.println("RealSubject--Method----");
	}
}
