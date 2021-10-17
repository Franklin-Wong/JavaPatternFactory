package decoratorpattern2;

public class ExpensiveCloth extends PersonCloth{
	
	public ExpensiveCloth(Person person) {
		super(person);
	}
	private void dressShirt(){
		System.out.println("´©TÐô");
	}
	private void dressJean(){
		System.out.println("´©Å£×Ð");
	}
	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressJean();
	}
}
