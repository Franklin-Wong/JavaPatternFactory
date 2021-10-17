package observerpattern;

public class Test {

	public static void main(String[] args) {
		//�������۲����
		TechFrontier frontier = new TechFrontier();
		//�����۲��߶���
		Coder mr_coder1 = new Coder("001");
		Coder coder2 = new Coder("002");
		Coder coder3 = new Coder("003");
		
		//�����۲���� �����ӹ۲���
		frontier.addObserver(mr_coder1);
		frontier.addObserver(coder2);
		frontier.addObserver(coder3);
		//���۲��߷�����Ϣ���۲��߽�����
		frontier.postNews("���¼����ܱ�������");
		
	}
}
