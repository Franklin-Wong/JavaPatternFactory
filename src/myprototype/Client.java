package myprototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		WordDocument originaldocument = new WordDocument();
		originaldocument.setmText("一篇文章");
		originaldocument.addImage("图片1");
		originaldocument.addImage("图片2");
		originaldocument.addImage("图片3");
		originaldocument.showDocument();
		//获取克隆的对象；不会执行 构造方法。
		WordDocument documentNew = originaldocument.clone();
		documentNew.setmText("这是拷贝的内容");
		documentNew.addImage("新图片");
		documentNew.showDocument();
		originaldocument.showDocument();

		
	}
}                                                                                                                                                                                                                                                                                                                                                                                          
