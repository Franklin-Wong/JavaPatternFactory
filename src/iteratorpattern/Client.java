package iteratorpattern;

public class Client {

	public static void main(String[] args) {
		//����3���������
		Handler1 handler1 = new Handler1();
		Handler2 handler2 = new Handler2();
		Handler3 handler3 = new Handler3();

		//���õ�ǰ�����ߵ���һ���ڵ�Ĵ����߶���
		handler1.mNextHandler = handler2;
		handler2.mNextHandler = handler3;
		
		//����3�������߶���
		Request1 request1 = new Request1("Request1");
		Request2 request2 = new Request2("Request2");
		Request3 request3 = new Request3("Request3");
		
		//���Ǵ���ʽ���׶η�������
		handler1.handlerRequest(request3);
//		handler2.handlerRequest(request2);
//		handler1.handlerRequest(request3);
		
	}
}
