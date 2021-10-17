package adapterpattern;

public class VoltAdapter extends Volt220 implements FiveVolt{

	Volt220 volt220;
	
	public VoltAdapter(Volt220 volt220) {
		super();
		this.volt220 = volt220;
	}

	
	public int getVolt220() {
		return volt220.getVolt220();
	}


	@Override
	public int getVolt5() {
		return 5;
	}

}
