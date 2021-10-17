package strategypattern;

public class CalculatePrice {
	private static final int BUS = 1;
	private static final int SUBWAY = 2;
	public static void main(String[] args) {
		CalculatePrice calculatePrice = new CalculatePrice();
		double busPrice = calculatePrice.busPrice(11);
		System.out.println("busPrice = "+busPrice);
		
	}
	
	private int busPrice(int km){
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
	private int subwayPrice(int km){
		if(km < 6){
			return 3;
		}else if(km > 6 && km < 12){
			return 4;
		}else if(km > 12 && km < 22){
			return 5;
		}else if(km > 22 && km < 32){
			return 6;
		}
		
		return 7;
	}
	//选择类型
	int calculatePrice(int km, int type){
		if(type == BUS){
			return busPrice(km);
		}else if (type == SUBWAY){
			return subwayPrice(km);
		}
		return 0;
	}

}
