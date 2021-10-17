package iteratorpattern;

public class Client {

	public static void main(String[] args) {
		//构造3个处理对象
		Handler1 handler1 = new Handler1();
		Handler2 handler2 = new Handler2();
		Handler3 handler3 = new Handler3();

		//设置当前处理者的下一个节点的处理者对象
		handler1.mNextHandler = handler2;
		handler2.mNextHandler = handler3;
		
		//构造3个请求者对象
		Request1 request1 = new Request1("Request1");
		Request2 request2 = new Request2("Request2");
		Request3 request3 = new Request3("Request3");
		
		//总是从链式的首段发起请求
		handler1.handlerRequest(request3);
//		handler2.handlerRequest(request2);
//		handler1.handlerRequest(request3);
		
	}
}
