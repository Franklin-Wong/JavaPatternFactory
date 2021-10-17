package mediatorpattern2;

public class Client {

	public static void main(String[] args) {
		//构造主板
		MainBoard mainBoard = new MainBoard();
		//分别构造各个零件
		CdDevice cdDevice = new CdDevice(mainBoard);
		CPU cpu = new CPU(mainBoard);
		GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
		SoundCard soundCard = new SoundCard(mainBoard);
		//中介者将各个零件安装到主板
		mainBoard.setCdDevice(cdDevice);
		mainBoard.setCpu(cpu);
		mainBoard.setGraphicsCard(graphicsCard);
		mainBoard.setSoundCard(soundCard);
		
		//CD设备开始播放
		cdDevice.load();
	}
}
