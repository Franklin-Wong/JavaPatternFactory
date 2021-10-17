package proxypattern;

public class ProxySubject implements Subject{

	private RealSubject mSubject;
	
	public ProxySubject(RealSubject mSubject) {
		super();
		this.mSubject = mSubject;
	}
	@Override
	public void visit() {
		//通过真实主题引用的对象，调用真实主题中的逻辑方法
		mSubject.visit();
	}
}
