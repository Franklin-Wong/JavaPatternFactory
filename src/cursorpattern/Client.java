package cursorpattern;

public class Client {
	public static void main(String[] args) {
		//����������������
		Aggregate<String> aggregate = new ConcreteAggregate<>();
		//�������������
		aggregate.add("��҅�ظ�IHF��i�Ļ�Ϊi����");
		aggregate.add("��҅�ظ�IHF��i�Ļ�Ϊi����");
		aggregate.add("��҅�ظ�IHF��i�Ļ�Ϊi����");
		//��ȡ�����ĵ�����
		Iterator<String> iterator = aggregate.iterator();
		//��������������������Ԫ��
		while (iterator.hasNext()) {
			//��ȡ�ҵ�����һ��Ԫ��
			System.out.println(iterator.next());
		}
	}
}
