package observerpattern;

public class Test {

	public static void main(String[] args) {
		//创建被观察对象
		TechFrontier frontier = new TechFrontier();
		//创建观察者对象
		Coder mr_coder1 = new Coder("001");
		Coder coder2 = new Coder("002");
		Coder coder3 = new Coder("003");
		
		//给被观察对象 逐个添加观察者
		frontier.addObserver(mr_coder1);
		frontier.addObserver(coder2);
		frontier.addObserver(coder3);
		//被观察者发布消息，观察者将接收
		frontier.postNews("最新技术周报发布了");
		
	}
}
