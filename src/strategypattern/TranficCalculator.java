package strategypattern;

public class TranficCalculator {
	//�����ӿڱ���
	ICalculateStrategy mCalculateStrategy;

	public static void main(String[] args) {
		TranficCalculator calculator = new TranficCalculator();
	//���ò��Ե�ģʽ����
		calculator.setStrategy(new SubwayStrategy());
		//ִ�в��Եľ��巽������̬��ͨ���������õ�������ʵ�ֵķ���
		int price = calculator.calculatePrice(12);
		System.out.println("�۸� = "+ price);
	}
	public void setStrategy(ICalculateStrategy calculateStrategy){
		this.mCalculateStrategy = calculateStrategy;
	}
	
	public int calculatePrice(int km){
		return mCalculateStrategy.calculatePrice(km);
	}
}
