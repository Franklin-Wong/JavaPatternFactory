package statepattern;

public class Client {

	public static void main(String[] args) {
		//���Ƶ��ӻ�
		TVController controller = new TVController();
		//����
		controller.powerOn();
		//���ֲ���
		controller.turnUp();
		//�ػ�
		controller.powerOff();
	}
}
  