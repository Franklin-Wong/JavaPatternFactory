package interpreterpattern;
/**
 * ����������������
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
