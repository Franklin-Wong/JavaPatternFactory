package myprototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		WordDocument originaldocument = new WordDocument();
		originaldocument.setmText("һƪ����");
		originaldocument.addImage("ͼƬ1");
		originaldocument.addImage("ͼƬ2");
		originaldocument.addImage("ͼƬ3");
		originaldocument.showDocument();
		//��ȡ��¡�Ķ��󣻲���ִ�� ���췽����
		WordDocument documentNew = originaldocument.clone();
		documentNew.setmText("���ǿ���������");
		documentNew.addImage("��ͼƬ");
		documentNew.showDocument();
		originaldocument.showDocument();

		
	}
}                                                                                                                                                                                                                                                                                                                                                                                          
