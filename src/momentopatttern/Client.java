package momentopatttern;

public class Client {

	public static void main(String[] args) {
		// 创建游戏对象
		CallOfDutyGame game = new CallOfDutyGame();
		// 打游戏
		game.play();
		// 创建备忘录管理者
		Caretaker caretaker = new Caretaker();
		// 游戏状态存档
		caretaker.setMemoto(game.creatMemotoeMemoto());
		// 退出游戏
		game.quit();
		// 恢复游戏
		CallOfDutyGame game2 = new CallOfDutyGame();
		game2.restore(caretaker.getMemoto());
	}

}
