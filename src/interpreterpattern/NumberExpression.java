package interpreterpattern;

/**
 * Êı×Ö½âÊÍÆ÷
 * @author Administion
 *
 */
public class NumberExpression extends ArithmeticExpression{

	private int num;
	
	public NumberExpression(int num) {
		this.num = num;
	}

	@Override
	public int interpreter() {
		return num;
	}

}
