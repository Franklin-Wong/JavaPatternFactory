package statepattern;

public class Client {

	public static void main(String[] args) {
		//控制电视机
		TVController controller = new TVController();
		//开机
		controller.powerOn();
		//各种操作
		controller.turnUp();
		//关机
		controller.powerOff();
	}
}
  