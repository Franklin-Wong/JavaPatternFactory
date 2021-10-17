package compositepatten;

public class Client {

	public static void main(String[] args) {
		//构造一个根节点
//		Composite root = new Composite("ROOT");
		//
		Component root = new Composite("ROOT");
		//构造两个支节点
		Composite branch1 = new Composite("BRANCH1");
		Composite branch2 = new Composite("BRANCH2");
		//构造两个叶子节点
		Leaf leaf1 = new Leaf("LEAF1");
		Leaf leaf2 = new Leaf("LEAF2");
		
		//将叶子节点添加到支节点中
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		//将支节点添加到根节点中
		root.addChild(branch1);
		root.addChild(branch2);
		//执行方法
		root.doSomething();
	}
}
