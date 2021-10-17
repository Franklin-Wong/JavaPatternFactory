package interpreterpattern;
/**
 * ÔËËã·ûºÅ³éÏó½âÊÍÆ÷
 * @author Administion
 *
 */
public abstract class OperatorExpression extends ArithmeticExpression{
	
	protected ArithmeticExpression expression1,expression2;

	public OperatorExpression(ArithmeticExpression expression1,
			ArithmeticExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	

}
