package proxypattern;

public class Client {

	public static void main(String[] args) {
		//������ʵ����Ķ���
		RealSubject realSubject = new RealSubject();
		//ͨ����ʵ���������һ���������
		ProxySubject proxySubject = new ProxySubject(realSubject);
		//���ô������ķ�������ӵ�����ʵ�����ҵ���߼�
		proxySubject.visit();
	}
}
