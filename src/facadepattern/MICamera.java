package facadepattern;

public class MICamera implements Camera{
	@Override
	public void open() {
		System.out.println("�����");
	}
	@Override
	public void takePhoto() {
		System.out.println("����");
	}
	@Override
	public void close() {
		System.out.println("�ر����");
	}
}
