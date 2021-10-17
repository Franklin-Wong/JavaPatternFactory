package cursorpattern;
/**
 * �����ӿ�
 */
public interface Aggregate<T> {
	/**
	 * �������������
	 * @param obj
	 */
	void add(T obj);
	/**
	 * �������Ƴ�����
	 * @param obj
	 */
	void remove(T obj);
	/**
	 * ���������ĵ�����
	 * @return
	 */
	Iterator<T> iterator();
	
}
