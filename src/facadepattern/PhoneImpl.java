package facadepattern;

public class PhoneImpl implements Phone{

	@Override
	public void dail() {
		System.out.println("��绰");
	}
	@Override
	public void hang() {
		System.out.println("�Ҷϵ绰");
	}
}
