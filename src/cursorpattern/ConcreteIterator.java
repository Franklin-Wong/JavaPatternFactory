package cursorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器
 */
public class ConcreteIterator<T> implements Iterator<T>{
	
	//创建容器
	private List<T> list = new ArrayList<>();
	//声明游标指针
	private int cursor = 0;

	public ConcreteIterator(List<T> list) {
		this.list = list;
	}

	@Override
	public T next() {
		T obj = null;
		if(hasNext()){
			obj = list.get(cursor++);
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		return cursor != list.size();
	}
	
}
