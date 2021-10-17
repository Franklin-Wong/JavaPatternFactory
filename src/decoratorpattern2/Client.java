package decoratorpattern2;

public class Client {

	public static void main(String[] args) {
		Person person = new Boy();
		PersonCloth cheapCloth = new CheapCloth(person);
		cheapCloth.dressed();
		PersonCloth expensiveCloth = new ExpensiveCloth(person);
		expensiveCloth.dressed();
	}
}
