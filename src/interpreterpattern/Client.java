package interpreterpattern;

public class Client {

	public static void main(String[] args) {
		Calculator calculator1 = new Calculator("1 + 12 + 655 + 255");
		System.out.println(calculator1.calculate());
		
		Calculator calculator2 = new Calculator("156 - 15 - 15");
		System.out.println(calculator2.calculate());
	}
}
