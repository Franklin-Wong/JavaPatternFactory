package iteratorpattern2;

public class CLient {

	public static void main(String[] args) {
		//1 构造各个领导对象
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		
		//2 设置各个领导的上一级的领导对象
		groupLeader.nextLeader = director;
		director.nextLeader = manager;
		manager.nextLeader = boss;
		
		//3 发起报账申请;从第一个领导的处理开始
		groupLeader.handleRequest(50000);
		
	}
}
