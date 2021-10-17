package interpreterpattern;
/**
 * 减法运算抽象解释器
 * @author Administion
 *
 */
public class SubtractionExpression extends OperatorExpression{

	public SubtractionExpression(ArithmeticExpression expression1,
			ArithmeticExpression expression2) {
		super(expression1, expression2);
	}

	@Override
	public int interpreter() {
		return expression1.interpreter() - expression2.interpreter();
	}

}
