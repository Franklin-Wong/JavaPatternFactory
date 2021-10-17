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
		//���㳬��10������
		int extraTotal = km - 10;
		//���㳬��5����ı���
		int extraFactor =(int)( extraTotal / 5);
		System.out.println("extraFactor = "+extraFactor);

		//���㳬��5���������
		int fraction = extraFactor % 5;
		int price = extraFactor * 1 + 1;
		//�۸�
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
	//ѡ������
	int calculatePrice(int km, int type){
		if(type == BUS){
			return busPrice(km);
		}else if (type == SUBWAY){
			return subwayPrice(km);
		}
		return 0;
	}

}
