package momentopatttern;

public class Client {

	public static void main(String[] args) {
		// ������Ϸ����
		CallOfDutyGame game = new CallOfDutyGame();
		// ����Ϸ
		game.play();
		// ��������¼������
		Caretaker caretaker = new Caretaker();
		// ��Ϸ״̬�浵
		caretaker.setMemoto(game.creatMemotoeMemoto());
		// �˳���Ϸ
		game.quit();
		// �ָ���Ϸ
		CallOfDutyGame game2 = new CallOfDutyGame();
		game2.restore(caretaker.getMemoto());
	}

}
