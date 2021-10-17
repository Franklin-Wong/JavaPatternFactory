package interpreterpattern;

public abstract class ArithmeticExpression {

	/**
	 * 抽象的解释方法，
	 * 具体的解释逻辑有子类实现
	 * @return 解释得到具体的值
	 */
	public abstract int interpreter();
}
