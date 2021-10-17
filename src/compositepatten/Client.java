package compositepatten;

public class Client {

	public static void main(String[] args) {
		//����һ�����ڵ�
//		Composite root = new Composite("ROOT");
		//
		Component root = new Composite("ROOT");
		//��������֧�ڵ�
		Composite branch1 = new Composite("BRANCH1");
		Composite branch2 = new Composite("BRANCH2");
		//��������Ҷ�ӽڵ�
		Leaf leaf1 = new Leaf("LEAF1");
		Leaf leaf2 = new Leaf("LEAF2");
		
		//��Ҷ�ӽڵ���ӵ�֧�ڵ���
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		//��֧�ڵ���ӵ����ڵ���
		root.addChild(branch1);
		root.addChild(branch2);
		//ִ�з���
		root.doSomething();
	}
}
