package interpreterpattern;
/**
 * 加法运算抽象解释器
 * @author Administration
 *
 */
public class AdditionExpression extends OperatorExpression{

	public AdditionExpression(ArithmeticExpression expression1,
			ArithmeticExpression expression2) {
		super(expression1, expression2);
	}

	@Override
	public int interpreter() {
		return expression1.interpreter() + expression2.interpreter();
	}

}
