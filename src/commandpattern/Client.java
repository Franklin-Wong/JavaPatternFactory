package commandpattern;

public class Client {

	public static void main(String[] args) {
	//����һ�������߶���
	Receiver receiver = new Receiver();
	//���ݽ����߶��󣬹���һ�������߱�����ָ����������Ŷ���
	Command concretCommand = new ConcretCommand(receiver);
	//���������� ���󣬹���һ�������߶���,��̬����
	Invoker invoker = new Invoker(concretCommand);
	//�����߷���������Ϊ
		invoker.action();
	}
	
}
