package strategypattern;

public class TranficCalculator {
	//声明接口变量
	ICalculateStrategy mCalculateStrategy;

	public static void main(String[] args) {
		TranficCalculator calculator = new TranficCalculator();
	//设置策略的模式对象
		calculator.setStrategy(new SubwayStrategy());
		//执行策略的具体方法，多态：通过父类引用调用子类实现的方法
		int price = calculator.calculatePrice(12);
		System.out.println("价格 = "+ price);
	}
	public void setStrategy(ICalculateStrategy calculateStrategy){
		this.mCalculateStrategy = calculateStrategy;
	}
	
	public int calculatePrice(int km){
		return mCalculateStrategy.calculatePrice(km);
	}
}
