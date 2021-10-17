package decoratorpattern2;

public class ExpensiveCloth extends PersonCloth{
	
	public ExpensiveCloth(Person person) {
		super(person);
	}
	private void dressShirt(){
		System.out.println("��T��");
	}
	private void dressJean(){
		System.out.println("��ţ��");
	}
	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressJean();
	}
}
