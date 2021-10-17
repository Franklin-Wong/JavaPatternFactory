package commandpattern2;

public class Player {
	public static void main(String[] args) {
		//������Ϸ�Ĳ�������
		TetrisMachine machine = new TetrisMachine();
		//������Ϸ���������
		RightCommand rightCommand = new RightCommand(machine);
		LeftCommand leftCommand = new LeftCommand(machine);
		//����ť��Ӳ�ͬ������
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		//��Ұ��°�ť ����������
		buttons.toLeft();
		buttons.toRight();
		
	}
}
