package iteratorpattern2;

public abstract class AbstractLeader {
	//��һ���쵼������
	protected AbstractLeader nextLeader;
	/**
	 * �����˵�����;�ж��Ƿ�����Լ����������� ��������
	 * @param money �ܹ������Ķ��
	 */
	public final void handleRequest(int money){
		if (money <= limit()) {
			handle(money);
		}else {
			System.out.println(getClass().getSimpleName() +"��Ȩ�������� �� "+ money +"Ԫ");		

			if(null != nextLeader){
				/**
				 * �ݹ鷽��
				 */
				nextLeader.handleRequest(money);
				System.out.println("��ʾ�ϼ�");		
				System.out.println(getClass().getSimpleName() +"��Ȩ�������� �� "+ money +"Ԫ");		

			}
		}
		
	}
	/**
	 * �����ܹ������Ķ��Ȩ��
	 * @return ����Ķ��
	 */
	public abstract int limit();
	/**
	 * �����˵�������Ϊ
	 * @param money ������Ϊ
	 */
	public abstract void handle(int money);
}
