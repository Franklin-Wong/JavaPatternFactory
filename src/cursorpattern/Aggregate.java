package cursorpattern;
/**
 * 容器接口
 */
public interface Aggregate<T> {
	/**
	 * 向容器添加数据
	 * @param obj
	 */
	void add(T obj);
	/**
	 * 从容器移除数据
	 * @param obj
	 */
	void remove(T obj);
	/**
	 * 创建容器的迭代器
	 * @return
	 */
	Iterator<T> iterator();
	
}
