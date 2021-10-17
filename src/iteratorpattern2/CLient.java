package iteratorpattern2;

public class CLient {

	public static void main(String[] args) {
		//1 ��������쵼����
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		
		//2 ���ø����쵼����һ�����쵼����
		groupLeader.nextLeader = director;
		director.nextLeader = manager;
		manager.nextLeader = boss;
		
		//3 ����������;�ӵ�һ���쵼�Ĵ���ʼ
		groupLeader.handleRequest(50000);
		
	}
}
