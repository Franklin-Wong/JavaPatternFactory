package iteratorpattern;

public abstract class AbstractRequest {
	private Object object;

	public AbstractRequest(Object object) {
		this.object = object;
	}
	/**
	 * 获取处理的内容对象 
	 * @return object
	 */
	public Object getContent() {
		return object;
	}
	/**
	 * 获取请求级别
	 * @return 请求级别
	 */
	public abstract int getRequestLevel();
	

}
