package commandpattern2;

public class Player {
	public static void main(String[] args) {
		//构造游戏的操作界面
		TetrisMachine machine = new TetrisMachine();
		//构造游戏的命令对象
		RightCommand rightCommand = new RightCommand(machine);
		LeftCommand leftCommand = new LeftCommand(machine);
		//给按钮添加不同的命令
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		//玩家按下按钮 ，发出命令
		buttons.toLeft();
		buttons.toRight();
		
	}
}
