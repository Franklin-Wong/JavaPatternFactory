package cursorpattern;

public class Client {
	public static void main(String[] args) {
		//创建具体容器对象
		Aggregate<String> aggregate = new ConcreteAggregate<>();
		//给容器添加数据
		aggregate.add("好覅回复IHF我i的华为i就搜");
		aggregate.add("好覅回复IHF我i的华为i就搜");
		aggregate.add("好覅回复IHF我i的华为i就搜");
		//获取容器的迭代器
		Iterator<String> iterator = aggregate.iterator();
		//迭代器遍历具体容器的元素
		while (iterator.hasNext()) {
			//获取找到的下一个元素
			System.out.println(iterator.next());
		}
	}
}
