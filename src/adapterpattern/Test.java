package adapterpattern;

public class Test {

	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter(new Volt220());
		System.out.println("Êä³öµçÑ¹ £º"+adapter.getVolt5());
	}
}
