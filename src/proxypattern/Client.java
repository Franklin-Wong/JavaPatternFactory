package proxypattern;

public class Client {

	public static void main(String[] args) {
		//构造真实主题的对象
		RealSubject realSubject = new RealSubject();
		//通过真实主题对象构造一个代理对象
		ProxySubject proxySubject = new ProxySubject(realSubject);
		//调用代理对象的方法，间接调用真实主题的业务逻辑
		proxySubject.visit();
	}
}
