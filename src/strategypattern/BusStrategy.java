package strategypattern;

public class BusStrategy implements ICalculateStrategy{

	@Override
	public int calculatePrice(int km) {
		//计算超过10公里数
		int extraTotal = km - 10;
		//计算超出5公里的倍数
		int extraFactor =(int)( extraTotal / 5);
		System.out.println("extraFactor = "+extraFactor);

		//计算超出5公里的余数
		int fraction = extraFactor % 5;
		int price = extraFactor * 1 + 1;
		//价格
		return fraction * 0.1 > 0 ? ++price : price;
	}

}
