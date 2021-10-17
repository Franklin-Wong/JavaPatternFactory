package decoratorpattern2;

public class CheapCloth extends PersonCloth{

	public CheapCloth(Person person) {
		super(person);
	}
	public void dressShorts(){
		System.out.println("´©¶Ì¿ã");
	}
	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}
}
