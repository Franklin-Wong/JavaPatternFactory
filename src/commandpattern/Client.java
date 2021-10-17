package commandpattern;

public class Client {

	public static void main(String[] args) {
	//构造一个接收者对象
	Receiver receiver = new Receiver();
	//根据接收者对象，构造一个命令者变量，指向具体命令着对象
	Command concretCommand = new ConcretCommand(receiver);
	//根据命令着 对象，构造一个请求者对象,多态属性
	Invoker invoker = new Invoker(concretCommand);
	//请求者发出请求行为
		invoker.action();
	}
	
}
