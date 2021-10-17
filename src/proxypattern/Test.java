package proxypattern;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//1 构造一个被代理对象
		Subject subject = new RealSubject();
		//2 获取被代理类的ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//3  构造一个动态代理
		DynamicProxy proxy = new DynamicProxy(subject);
		//4 通过loader构造一个代理对象
		Subject proxyInstance = (Subject) Proxy.newProxyInstance(loader, new Class[]{Subject.class}, proxy);
		//5 代理对象调用被代理对象的方法
		proxyInstance.visit();
	}
}
