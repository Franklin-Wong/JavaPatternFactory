package mediatorpattern2;

public class Client {

	public static void main(String[] args) {
		//��������
		MainBoard mainBoard = new MainBoard();
		//�ֱ���������
		CdDevice cdDevice = new CdDevice(mainBoard);
		CPU cpu = new CPU(mainBoard);
		GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
		SoundCard soundCard = new SoundCard(mainBoard);
		//�н��߽����������װ������
		mainBoard.setCdDevice(cdDevice);
		mainBoard.setCpu(cpu);
		mainBoard.setGraphicsCard(graphicsCard);
		mainBoard.setSoundCard(soundCard);
		
		//CD�豸��ʼ����
		cdDevice.load();
	}
}
