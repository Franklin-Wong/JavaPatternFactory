package proxypattern;

public class ProxySubject implements Subject{

	private RealSubject mSubject;
	
	public ProxySubject(RealSubject mSubject) {
		super();
		this.mSubject = mSubject;
	}
	@Override
	public void visit() {
		//ͨ����ʵ�������õĶ��󣬵�����ʵ�����е��߼�����
		mSubject.visit();
	}
}
