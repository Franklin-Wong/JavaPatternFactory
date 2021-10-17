package proxypattern;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//1 ����һ�����������
		Subject subject = new RealSubject();
		//2 ��ȡ���������ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//3  ����һ����̬����
		DynamicProxy proxy = new DynamicProxy(subject);
		//4 ͨ��loader����һ���������
		Subject proxyInstance = (Subject) Proxy.newProxyInstance(loader, new Class[]{Subject.class}, proxy);
		//5 ���������ñ��������ķ���
		proxyInstance.visit();
	}
}
