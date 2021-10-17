package interpreterpattern;

import java.util.Stack;

public class Calculator {

	//����һ��stackջ�洢������������صĽ�����
	private Stack<ArithmeticExpression> mExpStack = new Stack<>();

	public Calculator(String expression) {

		//��������ArithmeticExpression���͵���ʱ������ �洢��������ߵ����ֽ�����
		ArithmeticExpression exp1,exp2;
		//���ݿո�ָ���ʽ�ַ���
		String[] elements = expression.split(" ");
		//ѭ���������ʽԪ������
		for (int i = 0; i < elements.length; i++) {
			//�ж��������
			switch (elements[i].charAt(0)) {
			case '+'://����ǼӺ�
				//��ջ�еĽ�����������Ϊ���������ߵĽ�����
				//Removes the object at the top of this stack and returns that object as the value of this function.
				exp1 = mExpStack.pop();
				//ͬʱ��������������±����һ��Ԫ�أ�����Ϊһ�����ֽ�����
				exp2 = new NumberExpression(Integer.valueOf(elements[++i]));

				//ͨ�������������ֽ�����������ӷ����������
				//Pushes an item onto the top of this stack.
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
				
			case '-'://����Ǽ���
				exp1 = mExpStack.pop();
				exp2 = new NumberExpression(Integer.valueOf(elements[++i]));
				//�������������
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;

			default://���������
				/**
				 * �������������ţ���������
				 * ��������֣�ֱ�ӹ������ֽ���������ѹ��ջ
				 */
				mExpStack.push(new NumberExpression(Integer.valueOf(elements[i])));
				break;
			}
		}
	}
	/**
	* ������
	*/
	public int calculate(){
		return mExpStack.pop().interpreter();
	}
	
	
}
