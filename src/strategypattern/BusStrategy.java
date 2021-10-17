package strategypattern;

public class BusStrategy implements ICalculateStrategy{

	@Override
	public int calculatePrice(int km) {
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

}
