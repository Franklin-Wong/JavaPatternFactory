package iteratorpattern;

public abstract class AbstractRequest {
	private Object object;

	public AbstractRequest(Object object) {
		this.object = object;
	}
	/**
	 * ��ȡ��������ݶ��� 
	 * @return object
	 */
	public Object getContent() {
		return object;
	}
	/**
	 * ��ȡ���󼶱�
	 * @return ���󼶱�
	 */
	public abstract int getRequestLevel();
	

}
