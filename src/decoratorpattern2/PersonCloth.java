package decoratorpattern2;

public abstract class PersonCloth extends Person{

	protected Person person;
	
	public PersonCloth(Person person) {
		super();
		this.person = person;
	}
	@Override
	public void dressed() {
		person.dressed();
	}
}
