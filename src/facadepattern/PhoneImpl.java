package facadepattern;

public class PhoneImpl implements Phone{

	@Override
	public void dail() {
		System.out.println("打电话");
	}
	@Override
	public void hang() {
		System.out.println("挂断电话");
	}
}
